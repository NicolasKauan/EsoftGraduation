/* Aula 07 - Atribuição de modo misto em C (Sebesta 7.8, p. 321-322)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc modo_misto.c -o modo_misto && ./modo_misto
 */
#include <stdio.h>

int main(void) {
    int i = 3.7;             /* C converte em silêncio: trunca para 3 */
    char c = 300;            /* não cabe: sobra 44 (no máximo um aviso) */
    unsigned int u = -1;     /* 4294967295 */
    printf("%d %d %u\n", i, c, u);
    return 0;
}
