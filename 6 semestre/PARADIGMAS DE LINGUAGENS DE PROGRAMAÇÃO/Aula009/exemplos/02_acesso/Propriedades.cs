// Aula 09 - Propriedades em C# (Sebesta 11.4.4.2, p. 465-466)
// Online: https://onecompiler.com/csharp  (cole o código inteiro)
using System;

class Conta
{
    private decimal saldo;                    // campo privado

    public decimal Saldo                      // propriedade: parece campo, mas são métodos get/set
    {
        get { return saldo; }
        private set                           // só a própria classe altera
        {
            if (value < 0) throw new ArgumentException("saldo negativo");
            saldo = value;
        }
    }

    public string Titular { get; set; } = "";    // propriedade automática

    public void Depositar(decimal valor) => Saldo += valor;
}

class Program
{
    static void Main()
    {
        var c = new Conta { Titular = "Ana" };
        c.Depositar(100.50m);
        Console.WriteLine($"{c.Titular}: {c.Saldo}");   // Ana: 100.50
        // c.Saldo = 1000;     // ERRO de compilação: o set é privado
    }
}
