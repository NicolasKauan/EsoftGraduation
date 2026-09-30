/* Aula 07 - Expressões relacionais e booleanas em C (Sebesta 7.5, p. 313-315)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc relacionais.c -o relacionais && ./relacionais
 */
#include <stdio.h>

int main(void) {
    int a = 3, b = 2, c = 1;
    printf("%d\n", a > b > c);            /* 0: (3 > 2) vale 1, e 1 > 1 é falso (p. 315) */
    printf("%d\n", (a > b) && (b > c));   /* 1: o que se queria dizer */

    int x = 5;
    if (x = 0)                            /* ATRIBUIÇÃO, não comparação (p. 320) */
        printf("x é zero\n");
    else
        printf("x = %d (foi sobrescrito!)\n", x);

    if (-1)
        printf("-1 conta como verdadeiro em C\n");   /* todo valor diferente de 0 */
    return 0;
}
