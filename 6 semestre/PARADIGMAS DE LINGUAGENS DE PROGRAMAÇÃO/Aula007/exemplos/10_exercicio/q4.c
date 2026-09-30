/* Exercício Aula 07 - Questão 4: qual é a saída? Onde está o bug?
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 */
#include <stdio.h>

int main(void) {
    int saldo = 100, saque = 50;
    if (saque > saldo);
        printf("saldo insuficiente\n");
    printf("fim\n");
    return 0;
}
