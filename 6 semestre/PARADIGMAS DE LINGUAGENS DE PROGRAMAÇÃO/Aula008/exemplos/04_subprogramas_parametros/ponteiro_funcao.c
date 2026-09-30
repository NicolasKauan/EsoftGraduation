/* Aula 08 - Ponteiros para funções e chamada indireta (Sebesta 9.6-9.7, p. 392-395)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc ponteiro_funcao.c -o ponteiro_funcao && ./ponteiro_funcao
 */
#include <stdio.h>
#include <stdlib.h>

int decrescente(const void *a, const void *b) { return *(const int *)b - *(const int *)a; }

int dobro(int x)    { return 2 * x; }
int quadrado(int x) { return x * x; }

int main(void) {
    int v[] = {5, 2, 9, 1};
    qsort(v, 4, sizeof(int), decrescente);   /* passa um PONTEIRO para função (p. 392) */
    for (int i = 0; i < 4; i++)
        printf("%d ", v[i]);
    printf("\n");                            /* 9 5 2 1 */

    int (*operacoes[])(int) = {dobro, quadrado};   /* tabela de funções (p. 393) */
    for (int i = 0; i < 2; i++)
        printf("%d\n", operacoes[i](7));           /* 14 e 49: chamada indireta */
    return 0;
}
