# Aula 08: Subprogramas (exemplos)

Referência: Sebesta, *Conceitos de Linguagens de Programação*, 11ª ed., Caps. 9 e 10.

## Como executar no navegador

Abra o OneCompiler da linguagem, **apague o código de exemplo, cole o arquivo inteiro** e clique em **Run**.

| Linguagem | Endereço |
|---|---|
| Java | https://onecompiler.com/java (a classe se chama `Main`) |
| Python | https://onecompiler.com/python |
| C | https://onecompiler.com/c |
| C++ | https://onecompiler.com/cpp |
| C# | https://onecompiler.com/csharp |
| Go | https://onecompiler.com/go |
| Rust | https://onecompiler.com/rust |
| JavaScript | https://onecompiler.com/nodejs |

Para **visualizar a pilha de execução** passo a passo (registros de ativação), use o **Python Tutor**: https://pythontutor.com. Ele aceita Python, Java, C, C++ e JavaScript.

**Todos os 35 programas foram executados no OneCompiler em 23/09/2026** e produziram a saída indicada nos comentários.

Exceções esperadas:

- `q5.rs` não compila (erro E0382).
- `q6.py` termina com `UnboundLocalError`.
- As duas são respostas do exercício.

## Conteúdo

| Pasta | Tema | Sebesta |
|---|---|---|
| `01_parametros` | Posicionais, palavra-chave, padrão, variádicos, vários retornos | 9.2.3, p. 367-371 |
| `02_locais` | Locais dinâmicas da pilha × `static`; subprogramas aninhados | 9.4, p. 373-375 |
| `03_passagem` | Por valor, ponteiro, referência (C, C++, Java, C#, Python, Go, Rust) e apelidos | 9.5, p. 375-391 |
| `04_subprogramas_parametros` | Vinculação profunda (exemplo do livro), integração, ponteiros para função, lambdas | 9.6 e 9.7, p. 391-395 |
| `05_fechamentos` | `makeAdder` do livro, contadores, armadilha do `var` no laço | 9.12, p. 404-406 |
| `06_pilha` | Registros de ativação, recursão e estouro de pilha | 10.1-10.3, p. 416-427 |
| `07_exercicio` | "Qual é a saída?" (respostas nas anotações do slide) | - |
| `08_autopesquisa` | Corrotinas (geradores), sobrecarga e métodos genéricos | 9.9, 9.10 e 9.13 |
