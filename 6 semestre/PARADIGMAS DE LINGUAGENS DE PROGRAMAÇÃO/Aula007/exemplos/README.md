# Aula 07: Expressões, atribuição e estruturas de controle (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Caps. 7 e 8.

## Como executar no navegador

Abra o OneCompiler da linguagem, **apague o código de exemplo, cole o arquivo inteiro** e clique em **Run**.

| Linguagem | Endereço |
|---|---|
| Java | https://onecompiler.com/java (a classe se chama `Main`) |
| Go | https://onecompiler.com/go |
| Rust | https://onecompiler.com/rust |
| C | https://onecompiler.com/c |
| Python | https://onecompiler.com/python |
| JavaScript | https://onecompiler.com/nodejs (ou o console do navegador, F12) |
| PHP | https://onecompiler.com/php |
| Haskell | https://onecompiler.com/haskell |
| Ruby | https://onecompiler.com/ruby |
| Common Lisp | https://onecompiler.com/commonlisp |

**Todos os 49 programas foram executados no OneCompiler em 23/09/2026** e produziram a saída indicada nos comentários.

Exceções esperadas:

- `zune.c` termina com código 1 de propósito, depois de detectar o laço infinito.
- `guardas.py` e `select.go` dão resultados diferentes a cada execução. Essa é justamente a lição: não determinismo.

## Conteúdo

| Pasta | Tema | Sebesta |
|---|---|---|
| `01_precedencia` | Precedência, associatividade, divisão e resto | 7.2.1, p. 301-305 |
| `02_efeitos_colaterais` | Ordem dos operandos: **Java dá 8, C e Go dão 20** | 7.2.2, p. 307-309 |
| `03_sobrecarga` | Operadores sobrecarregados (Python, Rust, Java) | 7.3, p. 309-310 |
| `04_conversoes` | Alargamento, estreitamento, coerção (Java, Go, Rust, JS, PHP) | 7.4, p. 310-313 |
| `05_booleanas` | Relacionais, "truthiness", curto-circuito, `?.` e `??` | 7.5 e 7.6, p. 313-317 |
| `06_atribuicao` | Atribuição como expressão, múltipla, morsa `:=`, modo misto | 7.7 e 7.8, p. 317-322 |
| `07_selecao` | Else pendente, `switch` (C, Java, Go), `match` (Rust, Python) | 8.2, p. 330-341 |
| `08_iteracao` | `for` de C × Python, `break` rotulado, `for...in` × `for...of`, bug do Zune | 8.3, p. 341-352 |
| `09_desvio_protegido` | "goto fail" da Apple, comandos protegidos (Python, `select` de Go, Haskell) | 8.4 e 8.5, p. 352-355 |
| `10_exercicio` | "Encontre o bug" (respostas nas anotações do slide) | - |
| `11_autopesquisa` | Expressões em Ruby e em Lisp | 7.2.1.4 e 7.2.1.5, p. 305-306 |

## Dicas para a aula

- **Aula exploratória:** peça à turma para **prever a saída antes de clicar em Run**.
- **Erros de compilação:** as linhas marcadas com `ERRO de compilação` estão comentadas. Descomente uma para mostrar a mensagem do compilador.
- **Não determinismo:** rode `guardas.py` e `select.go` duas ou três vezes seguidas para a turma ver as saídas mudarem.
