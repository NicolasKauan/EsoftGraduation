/* Aula 08 - C passa por valor; ponteiros dão semântica de referência (Sebesta 9.5.4, p. 382)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc troca.c -o troca && ./troca
 */
#include <stdio.h>

void troca_valor(int a, int b) {        /* recebe CÓPIAS */
    int t = a; a = b; b = t;            /* troca só as cópias locais */
}

void troca_ponteiro(int *a, int *b) {   /* recebe endereços: caminho de acesso */
    int t = *a; *a = *b; *b = t;
}

int main(void) {
    int x = 1, y = 2;
    troca_valor(x, y);
    printf("por valor:    x=%d y=%d\n", x, y);   /* x=1 y=2 */
    troca_ponteiro(&x, &y);
    printf("por ponteiro: x=%d y=%d\n", x, y);   /* x=2 y=1 */
    return 0;
}
