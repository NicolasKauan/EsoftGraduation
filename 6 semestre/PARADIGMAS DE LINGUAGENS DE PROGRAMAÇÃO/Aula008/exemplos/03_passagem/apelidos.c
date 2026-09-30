/* Aula 08 - Apelidos criados pela passagem por referência (Sebesta 9.5.2.4, p. 379-380)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc apelidos.c -o apelidos && ./apelidos
 */
#include <stdio.h>

void soma_duas_vezes(int *a, int *b) {   /* soma *b em *a duas vezes */
    *a += *b;
    *a += *b;
}

int main(void) {
    int x = 1, y = 1;
    soma_duas_vezes(&x, &y);
    printf("x = %d\n", x);               /* 3 = 1 + 1 + 1 */

    int total = 1;
    soma_duas_vezes(&total, &total);     /* a e b são APELIDOS, como em fun(total, total) (p. 380) */
    printf("total = %d\n", total);       /* 4, e não 3: o primeiro += também mudou *b */
    return 0;
}
