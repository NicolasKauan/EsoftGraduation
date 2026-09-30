/* Aula 06 - Tipos enumeração (Sebesta 6.4, p. 245-247)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc enum.c -o enum && ./enum     (ou https://godbolt.org)
 */
#include <stdio.h>

enum Cor   { VERMELHO, VERDE, AZUL };
enum Fruta { MACA, BANANA, UVA };

int main(void) {
    enum Cor c = VERDE;
    printf("VERDE = %d\n", c);             /* 1: em C, enum é só um int */

    int soma = AZUL + UVA;                  /* aritmética entre "tipos" diferentes */
    printf("AZUL + UVA = %d\n", soma);      /* 4 */

    c = BANANA;                             /* compila: uma Fruta guardada numa Cor */
    c = 42;                                 /* compila: valor que nem existe no enum */
    printf("c = %d\n", c);
    return 0;
}
