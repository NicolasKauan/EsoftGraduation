/* Aula 07 - Atribuição como expressão em C (Sebesta 7.7, p. 317-321)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc atribuicao.c -o atribuicao && ./atribuicao
 */
#include <stdio.h>

int main(void) {
    int sum, count;
    sum = count = 0;                  /* múltiplos alvos: a atribuição devolve um valor (p. 320) */
    printf("%d %d\n", sum, count);

    int a, b = 10, c, d = 30;
    a = b + (c = d / b) - 1;          /* exemplo do livro (p. 320): c = 3, a = 12 */
    printf("a = %d, c = %d\n", a, c);

    const char *texto = "abc";
    int i = 0;
    char ch;
    while ((ch = texto[i++]) != '\0') /* padrão clássico de C (p. 319) */
        printf("[%c]", ch);
    printf("\n");

    count += 5;                       /* atribuição composta (p. 318) */
    count++;                          /* atribuição unária (p. 318) */
    printf("count = %d\n", count);    /* 6 */
    return 0;
}
