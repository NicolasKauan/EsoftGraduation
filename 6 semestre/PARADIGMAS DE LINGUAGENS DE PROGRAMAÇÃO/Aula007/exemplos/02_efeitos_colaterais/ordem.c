/* Aula 07 - Ordem de avaliação dos operandos e efeitos colaterais (Sebesta 7.2.2, p. 307-308)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc ordem.c -o ordem && ./ordem
 */
#include <stdio.h>

int a = 5;

int fun1(void) {        /* exemplo do livro, p. 307 */
    a = 17;             /* efeito colateral: altera a variável global */
    return 3;
}

int main(void) {
    a = a + fun1();     /* 8 (se 'a' for lido antes) ou 20 (se fun1 for chamada antes)? */
    printf("a = %d\n", a);   /* o padrão de C NÃO define a ordem; o gcc 14 dá 20 */

    /* int i = 1, j = i++ + i++;   comportamento indefinido (o gcc avisa com -Wall) */
    return 0;
}
