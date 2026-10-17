# Aula 11: Tratamento de exceções e de eventos (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Cap. 14.

## Como executar no navegador

Abra o OneCompiler da linguagem, **apague o código de exemplo, cole o arquivo inteiro** e clique em **Run**.

| Linguagem | Endereço |
|---|---|
| Java | https://onecompiler.com/java (a classe se chama `Main`) |
| C / C++ | https://onecompiler.com/c e https://onecompiler.com/cpp |
| Python | https://onecompiler.com/python |
| Go | https://onecompiler.com/go |
| Rust | https://onecompiler.com/rust |
| JavaScript | https://onecompiler.com/nodejs |
| C# | https://onecompiler.com/csharp |
| Ruby | https://onecompiler.com/ruby |
| Ada | https://onecompiler.com/ada (o procedimento se chama `Main`) |

**Exceção:** `08_eventos/dom_console.js` roda no **console do navegador**, e não no OneCompiler, porque precisa de uma página. Abra qualquer site, aperte F12, vá na aba Console, cole e tecle Enter.

**Todos os programas foram executados em 23/09/2026**: 28 no OneCompiler e o `dom_console.js` no navegador. Os que terminam com erro fazem isso de propósito (respostas do exercício):

- `q5.rs`: panic do `unwrap`.
- `q6.js`: rejeição não tratada encerra o Node.

## Conteúdo

| Pasta | Tema | Sebesta |
|---|---|---|
| `01_sem_excecoes` | Erros por valor de retorno em C (`fopen`, `strtol`, `atoi`) | 14.1.1, p. 597-598 |
| `02_cpp` | `throw`/`catch`, lançar `int`, `catch(...)`, RAII como finalização | 14.2, p. 602-606 |
| `03_java` | Verificadas × não verificadas, `throws`, `finally`, try-with-resources, asserções | 14.3, p. 606-613 |
| `04_python` | `try`/`except`/`else`/`finally`, EAFP, `raise ... from`, `with` | 14.4.1, p. 613-615 |
| `05_erros_como_valores` | Go (`error`, `defer`, `panic`/`recover`) e Rust (`Result`, `?`) | - |
| `06_mesmo_cenario` | **O mesmo problema em 5 linguagens**: converter "4", "0" e "abc" e dividir 100 | - |
| `07_js_async` | Erros em código assíncrono: `.catch`, `try`/`await`, rejeição não tratada | - |
| `08_eventos` | Modelo de eventos de Java (ouvintes), `EventEmitter` (Node), DOM (navegador), C# (`event`) | 14.5-14.7, p. 616-628 |
| `09_finalizacao` | `defer` (Go), `Drop` (Rust), `ensure` e `retry` (Ruby) | 14.1.2 e 14.4.2 |
| `10_exercicio` | "O que é impresso?" (respostas nas anotações do slide) | - |
| `11_autopesquisa` | **Exceções em Ada** (constam no plano de ensino) | - |
