# Aula 06: Tipos de dados (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Cap. 6.

## Como executar no navegador (sem instalar nada)

Abra o OneCompiler da linguagem, **apague o código de exemplo, cole o arquivo inteiro** e clique em **Run**.

| Linguagem | Endereço | Observação |
|---|---|---|
| Java | https://onecompiler.com/java | A classe se chama `Main` em todos os exemplos (exigência do site). Java 25. |
| Go | https://onecompiler.com/go | Go 1.27. |
| Rust | https://onecompiler.com/rust | Compila em modo **debug**: o estouro de inteiro gera panic, como o slide mostra. |
| C | https://onecompiler.com/c | gcc 14. |
| Python | https://onecompiler.com/python | Python 3.12. |
| JavaScript | https://onecompiler.com/nodejs | Node 22. Também funciona no console do navegador (F12). |
| TypeScript | https://www.typescriptlang.org/play | Use o **TypeScript Playground**: o OneCompiler (onecompiler.com/typescript) executa, mas **não verifica os tipos**. |

**Todos os 43 programas foram executados no OneCompiler em 23/09/2026** e produziram a saída indicada nos comentários. Os que terminam com erro fazem isso de propósito:

- `overflow.rs` e `limites.rs`: panic.
- `limites.go` e `ponteiros.go`: panic.
- `Q4.java`: exceção.
- `q5.rs`: erro de compilação E0382.

## Conteúdo

| Pasta | Tema | Sebesta | Arquivos |
|---|---|---|---|
| `01_inteiros` | Inteiros e estouro | 6.2.1.1, p. 236 | `Overflow.java`, `overflow.go`, `overflow.rs`, `inteiros.py` |
| `02_ponto_flutuante` | Ponto flutuante e decimal | 6.2.1.2 a 6.2.1.4, p. 237-238 | `flutuante.js`, `Dinheiro.java`, `flutuante.py` |
| `03_cadeias` | Cadeias de caracteres e Unicode | 6.2.3 e 6.3, p. 239-244 | `cadeias.go`, `cadeias.rs`, `Cadeias.java`, `cadeias.js`, `cadeias.py` |
| `04_enumeracoes` | Tipos enumeração | 6.4, p. 245-247 | `enum.c`, `Enumeracao.java`, `enumeracao.rs` |
| `05_matrizes` | Limites de índices e fatias | 6.5, p. 247-258 | `limites.*`, `fatias.*` |
| `06_unioes` | Uniões livres e discriminadas | 6.10, p. 270-273 | `uniao_livre.c`, `uniao.rs`, `uniao.ts`, `Uniao.java` |
| `07_ponteiros` | Ponteiros e referências | 6.11, p. 273-285 | `ponteiro_solto.c`, `ponteiros.go`, `Referencias.java`, `posse.rs` |
| `08_exercicio` | Exercício "preveja a saída" (respostas nas anotações do slide 21) | - | `q1.js` ... `q6.c` |
| `09_autopesquisa` | Associativas, registros, tuplas e listas | 6.6 a 6.9, p. 259-270 | `associativas.*`, `Registros.java`, `registros.rs`, `tuplas.py` |

## Dicas para a aula

- **Mostrar erros de compilação:** as linhas marcadas com `// ERRO de compilação` estão comentadas de propósito. Descomente uma e clique em Run de novo para ver a mensagem do compilador.
- **Erros de memória em C:** no OneCompiler, os exemplos de C imprimem lixo ou corrompem variáveis em silêncio, e é justamente essa a lição. Para ver o erro sendo *detectado*, use o Compiler Explorer (https://godbolt.org). Escolha o gcc, coloque as opções `-g -fsanitize=address` e ative "Execute the code".
- **Alternativas:** Go Playground (https://go.dev/play) e Rust Playground (https://play.rust-lang.org, modo Debug) também funcionam.

## Executar localmente (opcional)

| Linguagem | Comando |
|---|---|
| Java 11+ (`Uniao.java` exige 21+) | `java Overflow.java`: o modo de arquivo único aceita a classe `Main` com outro nome de arquivo |
| Go | `go run overflow.go` (um arquivo por vez; cada um é um programa independente) |
| Rust | `rustc overflow.rs && ./overflow` |
| C | `gcc enum.c -o enum && ./enum` |
| JavaScript | `node flutuante.js` |
| TypeScript | `npx tsc --strict uniao.ts && node uniao.js` |
| Python | `python inteiros.py` |

Para o professor: `python ferramentas/testar_onecompiler.py Aula006/exemplos` roda todos os exemplos no OneCompiler e mostra as saídas.
