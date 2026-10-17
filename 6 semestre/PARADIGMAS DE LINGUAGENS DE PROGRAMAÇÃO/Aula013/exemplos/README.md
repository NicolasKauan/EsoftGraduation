# Aula 13: Paradigma lógico e fechamento (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Cap. 16.

## Como executar no navegador

Há duas opções, e **todos os arquivos funcionam nas duas**:

| Onde | Como | Observação |
|---|---|---|
| **OneCompiler**: https://onecompiler.com/prolog | Apague o exemplo, cole o arquivo inteiro e clique em **Run**. | Usa o **GNU Prolog**. Não é interativo: cada arquivo tem um `main` que executa as consultas e mostra todas as respostas. |
| **SWISH**: https://swish.swi-prolog.org | Clique no **+** (nova aba) e em **Program**. Cole o arquivo, digite uma consulta na caixa "Your query goes here..." (canto inferior direito, por exemplo `ancestor(A, tom).`) e clique em **Run!**. Use **Next** para ver as outras respostas. | Usa o **SWI-Prolog**. É interativo: ideal para o laboratório. O `main` também executa ao carregar. |

**Todos os programas foram executados em 23/09/2026**, no OneCompiler e no SWISH (este pela API Pengines, com `ferramentas/testar_swish.py`). As saídas foram iguais, com estas exceções:

- `fatorial(20, F)`: no GNU Prolog, os inteiros têm 60 bits e **estouram sem aviso** (`127058998962946048`). No SWI-Prolog, o resultado é o certo (`2432902008176640000`).
- Os arquivos de `07_codigo_do_livro` mostram as diferenças entre o livro e as duas implementações (tabela abaixo).
- `05_deficiencias/laco_infinito.pl` e `08_exercicio/q6.pl` terminam com **estouro de pilha de propósito**. Por isso não foram executados no SWISH.
- `04_listas/pratica.pl` roda, mas mostra "esperado ..." até o aluno completar as relações.

### Cuidados com o GNU Prolog (OneCompiler)

1. **As cláusulas de um mesmo predicado precisam ficar juntas.** Se houver outra coisa no meio, o GNU Prolog **descarta as cláusulas seguintes sem mostrar aviso** no OneCompiler. O SWI-Prolog avisa ("Clauses of female/1 are not together") e mantém todas.
2. `append/3`, `member/2` e `reverse/2` já existem e **não podem ser redefinidos**. Por isso as versões do livro aparecem com nomes em português (`anexar`, `membro`).
3. `not/1` não existe. A negação do padrão ISO é `\+`.
4. O estouro de pilha é um erro fatal e não pode ser capturado com `catch/3`.

## Conteúdo

| Pasta | Tema | Sebesta |
|---|---|---|
| `01_familia` | Fatos, regras, consultas, recursão (`ancestor`) e irmãos com negação | 16.6.2-16.6.4, p. 697-700 e 714 |
| `02_inferencia` | Rastreamento com as 4 portas (chama, sai, refaz, falha) e retrocesso | 16.6.5, p. 700-705, Figura 16.1 |
| `03_aritmetica` | `is`, `=` e `=:=`; `distance`; `K is K + 1`; fatorial | 16.6.6, p. 703-705 |
| `04_listas` | `[H \| T]`, `append` ao contrário, `reverse` e `member`; **prática para completar** (`pratica` e `pratica_resolvida`) | 16.6.7, p. 706-711 |
| `05_deficiencias` | Ordem das cláusulas e corte, laço infinito, mundo fechado e negação, ordenar permutando | 16.7, p. 711-716 |
| `06_aplicacoes` | Prolog × SQL e Datalog (fecho transitivo), sistema especialista, quebra-cabeça | 16.8, p. 716-718 |
| `07_codigo_do_livro` | **Caça ao erro:** trechos do livro que não rodam como impressos | ver abaixo |
| `08_exercicio` | "O que o Prolog responde?" (respostas nas anotações dos slides) | - |

## Trechos do livro que não rodam como impressos

| Página | Trecho | GNU Prolog (OneCompiler) | SWI-Prolog (SWISH) | Correção |
|---|---|---|---|---|
| p. 698 | Fatos da família, alternando `female` e `male` | `female(mary)` e `male(jake)` **somem** sem aviso | Funciona, com aviso | Agrupar as cláusulas de cada predicado |
| p. 708 | `append` do livro | "redefining built-in predicate append/3" | Funciona | Usar outro nome |
| p. 714 | `sibling(X, Y) :- (parent(M, X), parent(M, Y).` | Erro de sintaxe | Erro de sintaxe | Tirar o `(` que sobra |
| p. 714 | `not(X = Y)` | "undefined reference to not/1" | Funciona | `\+ X = Y` (padrão ISO) |
| p. 716 | `sorted([x, y \| list]) :- x <= y, ...` | Erro de sintaxe | Erro de sintaxe | Variáveis em maiúsculas (`X`, `Y`, `List`) e o operador `=<`; tirar o espaço antes do `(` |
| p. 703 | "se A estiver instanciada, a cláusula não será satisfeita" | `X = 3, X is 1 + 2` **dá yes** | Dá yes | Com o lado esquerdo instanciado, `is` **compara** |
| p. 713 | `is_integer` no `divide` | Não é predefinido | Não é predefinido | Definir (está em `05_deficiencias/ordem_e_corte.pl`) |
