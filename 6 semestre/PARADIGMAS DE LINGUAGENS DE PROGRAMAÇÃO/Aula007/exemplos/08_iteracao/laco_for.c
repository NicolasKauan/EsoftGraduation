/* Aula 07 - O for das linguagens baseadas em C (Sebesta 8.3.1.2, p. 342-344)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc laco_for.c -o laco_for && ./laco_for
 */
#include <stdio.h>

int main(void) {
    for (int i = 0; i < 10; i++) {   /* a variável do laço pode ser alterada no corpo */
        printf("%d ", i);
        i += 2;                      /* 0 3 6 9 */
    }
    printf("\n");

    int soma = 0, i = 1;
    for (; i <= 100; )               /* as três expressões são opcionais */
        soma += i++;
    printf("soma = %d\n", soma);     /* 5050 */

    for (int a = 0, b = 10; a < b; a++, b--)   /* operador vírgula: duas variáveis */
        printf("(%d,%d) ", a, b);
    printf("\n");
    return 0;
}
