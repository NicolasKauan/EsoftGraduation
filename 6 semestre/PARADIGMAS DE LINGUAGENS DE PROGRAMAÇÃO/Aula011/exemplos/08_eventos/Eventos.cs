// Aula 11 - Eventos em C#: event e delegates (Sebesta 14.7, p. 622-628)
// Online: https://onecompiler.com/csharp  (cole o código inteiro)
using System;

class Botao
{
    public event EventHandler<string> Clicado;                         // o evento
    public void Clicar(string quem) => Clicado?.Invoke(this, quem);   // dispara, se houver ouvintes
}

class Program
{
    static void Main()
    {
        var b = new Botao();
        b.Clicado += (origem, quem) => Console.WriteLine($"olá, {quem}");   // registra tratadores
        b.Clicado += (origem, quem) => Console.WriteLine($"registro: clique de {quem}");
        b.Clicar("Ana");

        EventHandler<string> temporario = (o, q) => Console.WriteLine("temporário");
        b.Clicado += temporario;
        b.Clicado -= temporario;                                       // remove o tratador
        b.Clicar("Bia");
    }
}
