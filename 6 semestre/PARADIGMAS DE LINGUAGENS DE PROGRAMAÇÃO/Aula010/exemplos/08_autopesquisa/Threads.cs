// Autopesquisa - Linhas de execução em C# (Sebesta 13.8, p. 578-583)
// Online: https://onecompiler.com/csharp  (cole o código inteiro)
using System;
using System.Threading;
using System.Threading.Tasks;

class Program
{
    static int semLock = 0, comLock = 0, atomico = 0;
    static readonly object trava = new object();

    static void Main()
    {
        Parallel.For(0, 1_000_000, i =>              // concorrência em nível de laço
        {
            semLock++;                                // condição de corrida
            lock (trava) { comLock++; }               // lock: o monitor de C# (p. 581)
            Interlocked.Increment(ref atomico);       // operação atômica
        });
        Console.WriteLine($"sem lock: {semLock}  com lock: {comLock}  Interlocked: {atomico}");

        Task<int> tarefa = Task.Run(() => 6 * 7);     // tarefa assíncrona
        Console.WriteLine($"resultado da tarefa: {tarefa.Result}");   // 42
    }
}
