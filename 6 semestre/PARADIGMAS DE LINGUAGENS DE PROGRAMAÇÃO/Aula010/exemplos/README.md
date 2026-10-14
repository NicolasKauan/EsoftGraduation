# Aula 10: Concorrência (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Cap. 13.

## Como executar no navegador

Abra o OneCompiler da linguagem, **apague o código de exemplo, cole o arquivo inteiro** e clique em **Run**.

| Linguagem | Endereço |
|---|---|
| Java | https://onecompiler.com/java (a classe se chama `Main`; Java 25, com threads virtuais) |
| Go | https://onecompiler.com/go |
| Rust | https://onecompiler.com/rust |
| Python | https://onecompiler.com/python |
| JavaScript | https://onecompiler.com/nodejs |
| Ada | https://onecompiler.com/ada (o procedimento se chama `Main`) |
| C# | https://onecompiler.com/csharp |
| Elixir | https://onecompiler.com/elixir |

**Todos os 24 programas foram executados no OneCompiler em 23/09/2026.** Em concorrência, **muitas saídas mudam a cada execução**, e isso é parte da lição:

- `Corrida.java`, `corrida.go`, `Q1.java` e `Threads.cs` perdem atualizações em quantidades diferentes a cada vez. Exemplos observados: 1.011.017 de 2.000.000 e 938.548 de 1.000.000.
- `Semaforo.java` e `trabalhadores.go` intercalam as linhas de forma diferente a cada execução.
- `Impasse.java` e `Q4.java` entram em impasse de propósito. Eles o **detectam** depois de 1 s e se encerram com `System.exit`.
- `q5.rs` não compila (E0373) e `q6.go` termina com "all goroutines are asleep - deadlock!". As duas são respostas do exercício.

## Conteúdo

| Pasta | Tema | Sebesta |
|---|---|---|
| `01_corrida` | As 4 respostas da Figura 13.1; atualizações perdidas em Java e Go | 13.2.1, p. 547-549 |
| `02_impasse` | Impasse (deadlock) detectado em Java | 13.2.1, p. 551 |
| `03_semaforos` | Produtor-consumidor com semáforos (`Semaphore`) | 13.3 e 13.7.3, p. 552-557 e 572 |
| `04_monitores` | Monitor com `synchronized`/`wait`/`notifyAll`; atômicos e cadeados; threads virtuais | 13.4 e 13.7, p. 557-578 |
| `05_mensagens` | Canais de Go, grupo de trabalhadores, `select` com tempo limite; canais e `Arc<Mutex>` em Rust | 13.5, p. 559-560 |
| `06_async` | Laço de eventos do JavaScript, `async`/`await`, `asyncio` | - |
| `07_exercicio` | "O que acontece?" (respostas nas anotações do slide) | - |
| `08_autopesquisa` | Tarefas e rendezvous em Ada, threads em C#, atores em Elixir, fluxos paralelos em Java | 13.6, 13.8, 13.9, 13.10 |
