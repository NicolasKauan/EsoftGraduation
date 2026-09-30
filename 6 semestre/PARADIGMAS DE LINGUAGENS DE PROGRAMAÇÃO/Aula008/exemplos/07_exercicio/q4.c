/* Exercício Aula 08 - Questão 4: qual é a saída? Por quê?
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 */
#include <stdio.h>

int contador(void) {
    static int n = 0;
    return ++n;
}

int main(void) {
    contador();
    contador();
    printf("%d\n", contador());
    return 0;
}
