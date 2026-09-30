/* Aula 06 - Problemas com ponteiros (Sebesta 6.11.3-6.11.4, p. 275-278)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc ponteiro_solto.c -o ponteiro_solto && ./ponteiro_solto
 * Detectar:  gcc -g -fsanitize=address ponteiro_solto.c -o ponteiro_solto && ./ponteiro_solto
 * Online com detecção: https://godbolt.org (gcc, opções -g -fsanitize=address, ative "Execute the code")
 */
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    /* 1) Ponteiro solto (6.11.3.1, p. 275) */
    int *p1 = malloc(sizeof(int));
    int *p2 = p1;            /* p2 é um apelido de p1 */
    *p1 = 42;
    free(p1);                /* libera a variável; p2 continua apontando para lá */
    p1 = NULL;
    printf("*p2 depois do free = %d  (uso após liberação: indefinido!)\n", *p2);

    /* 2) Variável dinâmica do monte perdida = vazamento (6.11.3.2, p. 276) */
    int *q = malloc(100 * sizeof(int));
    q = malloc(100 * sizeof(int));   /* o primeiro bloco ficou inacessível: lixo */
    free(q);

    /* 3) Aritmética de ponteiros (6.11.4, p. 277-278) */
    int list[5] = {10, 20, 30, 40, 50};
    int *ptr = list;                 /* ptr aponta para list[0] */
    printf("*(ptr + 2) = %d, ptr[3] = %d\n", *(ptr + 2), ptr[3]);
    printf("*(ptr + 7) = %d  (fora da matriz: ninguém impede)\n", *(ptr + 7));
    return 0;
}
