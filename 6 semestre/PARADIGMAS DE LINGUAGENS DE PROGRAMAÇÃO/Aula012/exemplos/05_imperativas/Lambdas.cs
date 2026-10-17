// Aula 12 - Expressões lambda em C# (Sebesta 15.10, p. 675-676)
// Online: https://onecompiler.com/csharp  (cole o código inteiro)
using System;
using System.Linq;

class Program {
    static void Main() {
        int[] numbers = {-3, 0, 4, 5, 1, 7, -3, -6, -9, 0, 3};
        int[] positives = Array.FindAll(numbers, n => n > 0);         // p. 675
        Console.WriteLine(string.Join(", ", positives));               // 4, 5, 1, 7, 3

        Func<int, int, int> eval1 = (a, b) => 3 * a + (b / 2);        // p. 675
        Console.WriteLine(eval1(6, 22));                                // 29

        int limite = 3;                         // variável capturada (p. 676)
        Func<int, bool> maior = n => n > limite;
        limite = 4;                             // o fechamento enxerga a MUDANÇA
        Console.WriteLine(maior(4));            // False (em Java, isso nem compila)

        // LINQ: o pipeline funcional do C#
        var quadradosPares = numbers.Where(n => n % 2 == 0).Select(n => n * n).Distinct().OrderBy(n => n);
        Console.WriteLine(string.Join(", ", quadradosPares));          // 0, 16, 36
    }
}
