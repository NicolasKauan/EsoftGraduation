/* Aula 06 - Matrizes e verificação de índices (Sebesta 6.5.2, p. 249)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc limites.c -o limites && ./limites
 * Detectar o erro: gcc -g -fsanitize=address limites.c -o limites && ./limites
 * Online com detecção: https://godbolt.org (gcc, opções -g -fsanitize=address, ative "Execute the code")
 */
#include <stdio.h>

int main(void) {
    int antes = 111;
    int v[3] = {10, 20, 30};
    int depois = 222;

    for (int i = 0; i <= 3; i++)            /* erro clássico: <= em vez de < */
        printf("v[%d] = %d\n", i, v[i]);    /* v[3]: comportamento indefinido */

    v[4] = 99;                              /* escrita fora dos limites: ninguém impede */
    printf("antes = %d, depois = %d\n", antes, depois); /* uma delas pode ter mudado! */
    return 0;
}
