// Aula 08 - C#: por valor (padrão), ref e out (Sebesta 9.5.4, p. 383)
// Online: https://onecompiler.com/csharp  (cole o código inteiro)
using System;

class Program
{
    static void Troca(ref int a, ref int b) { int t = a; a = b; b = t; }   // por referência

    static bool Dividir(int a, int b, out int quociente)                   // modo de SAÍDA
    {
        if (b == 0) { quociente = 0; return false; }
        quociente = a / b;
        return true;
    }

    static void Main()
    {
        int x = 1, y = 2;
        Troca(ref x, ref y);                     // o ref aparece também na CHAMADA
        Console.WriteLine($"x={x} y={y}");       // x=2 y=1

        if (Dividir(17, 5, out int q))
            Console.WriteLine($"quociente = {q}");   // quociente = 3
        if (int.TryParse("123", out int n))          // padrão comum na biblioteca do .NET
            Console.WriteLine(n + 1);                // 124
    }
}
