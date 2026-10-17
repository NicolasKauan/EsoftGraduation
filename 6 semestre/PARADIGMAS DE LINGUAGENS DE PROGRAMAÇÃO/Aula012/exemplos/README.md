# Aula 12: Paradigma funcional (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Cap. 15.

## Como executar no navegador

Abra o OneCompiler da linguagem, **apague o código de exemplo, cole o arquivo inteiro** e clique em **Run**.

| Linguagem | Endereço |
|---|---|
| Scheme | https://onecompiler.com/scheme (usa o GNU Guile) |
| Haskell | https://onecompiler.com/haskell |
| Common Lisp | https://onecompiler.com/commonlisp (usa o SBCL) |
| OCaml (família ML) | https://onecompiler.com/ocaml |
| F# | https://onecompiler.com/fsharp |
| Java | https://onecompiler.com/java (a classe se chama `Main`) |
| JavaScript | https://onecompiler.com/nodejs |
| Python | https://onecompiler.com/python |
| Rust | https://onecompiler.com/rust |
| C# | https://onecompiler.com/csharp |
| Ruby | https://onecompiler.com/ruby |
| C | https://onecompiler.com/c |

**Todos os 32 programas foram executados no OneCompiler em 23/09/2026.**

Alguns falham de propósito:

- Os quatro arquivos de `07_codigo_do_livro` são trechos do livro **copiados como estão impressos**. Três deles não compilam ou falham no Haskell e no Common Lisp atuais, e o de Python roda, mas imprime `<map object ...>` em vez da lista.
- `02_scheme/pratica.scm` roda, mas mostra "esperado ..." até o aluno completar as funções.

## Conteúdo

| Pasta | Tema | Sebesta |
|---|---|---|
| `01_fundamentos` | Função pura × impura, transparência referencial, lambda, composição, `map`, redução | 15.2-15.3, p. 633-637 |
| `02_scheme` | O essencial (`basico`), recursão e recursão em cauda (`recursao`), formas funcionais e `eval` (`ordem_superior`), **prática para completar** (`pratica` e `pratica_resolvida`) | 15.5, p. 641-659 |
| `03_haskell` | Casamento de padrões, guardas, compreensões, quicksort, currying (`basico`); avaliação preguiçosa e listas infinitas (`preguica`) | 15.8, p. 666-671 |
| `04_outras_funcionais` | Common Lisp, ML (OCaml) e F#: autopesquisa | 15.6, 15.7 e 15.9 |
| `05_imperativas` | O funcional em Java (Streams), JavaScript, Rust, Python, C# e Ruby | 15.10, p. 674-677 |
| `06_comparacao` | Soma dos cubos em C (laço e recursão) e em Haskell | 15.11, p. 677-679 |
| `07_codigo_do_livro` | **Caça ao erro:** trechos do livro que não rodam hoje como impressos | ver abaixo |
| `08_exercicio` | Reescrever laços como *pipelines* (`enunciado`) e a resolução (`resolucao`) | - |

## Trechos do livro que não rodam como impressos

| Página | Trecho | O que acontece | Correção |
|---|---|---|---|
| p. 659 | `factorial` em Common Lisp | O parâmetro se chama `x`, mas o corpo usa `n`; e falta parêntese em `(factorial (- n 1))` | `(defun factorial (n) ... (* n (factorial (- n 1))))` |
| p. 660 | `'(a ,(* 3 4) c)` | Precisa de crase, e não de apóstrofo | `` `(a ,(* 3 4) c) `` |
| p. 666 | `add` com currying em Scheme | Falta o `(` antes de `DEFINE` | `(define (add y) (lambda (x) (+ y x)))` |
| p. 667 | `fib (n + 2) = ...` | Padrões "n + k" foram removidos no Haskell 2010 | `fib n = fib (n - 1) + fib (n - 2)` |
| p. 669 | quicksort em Haskell | `b <- h` em vez de `b <= h`: erro de tipo | `sort [b \| b <- t, b <= h]` |
| p. 676 | `map` em Python "retorna [8 64 216 512]" | Em Python 3, `map` devolve um iterador preguiçoso | `list(map(...))`; o `partial` também precisa de `from functools import partial` |
| p. 679 | Nota do tradutor: `sum_cube` recursivo em C | O caso base `(n == 1) ? 0` perde o 1: dá 35 para n = 3 | `(n == 0) ? 0 : ...` |
| p. 659 | `eval` com um parâmetro | O próprio livro avisa que o Scheme atual exige o ambiente | `(eval expr (interaction-environment))` |
