/* Aula 12 - Soma dos cubos no estilo imperativo (Sebesta 15.11, p. 678-679)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc soma_cubos.c -o soma_cubos && ./soma_cubos
 */
#include <stdio.h>

int sum_cubes(int n) {                 /* versão do livro (p. 678) */
    int sum = 0;
    for (int index = 1; index <= n; index++)
        sum += index * index * index;
    return sum;
}

/* Versão recursiva da nota do tradutor (p. 679), copiada como está: o caso base está errado! */
int sum_cube(int n) {
    return (n == 1) ? 0 : n * n * n + sum_cube(n - 1);
}

/* Corrigida: sem variáveis nem laço, só recursão */
int soma_cubos(int n) {
    return (n == 0) ? 0 : n * n * n + soma_cubos(n - 1);
}

int main(void) {
    for (int n = 1; n <= 4; n++)
        printf("n=%d  laço=%d  nota do tradutor=%d  recursiva corrigida=%d\n",
               n, sum_cubes(n), sum_cube(n), soma_cubos(n));
    /* O int de 32 bits estoura: o certo seria 250500250000 */
    printf("n=1000  laço=%d\n", sum_cubes(1000));
    return 0;
}
