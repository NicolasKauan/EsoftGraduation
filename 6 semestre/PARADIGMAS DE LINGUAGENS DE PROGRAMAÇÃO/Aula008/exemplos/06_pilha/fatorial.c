/* Aula 08 - Registros de ativação na pilha: fatorial recursivo (Sebesta 10.3.3, p. 425-427)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc fatorial.c -o fatorial && ./fatorial
 * Visualize passo a passo em https://pythontutor.com (escolha a linguagem C).
 */
#include <stdio.h>

int fatorial(int n) {
    /* cada ativação tem o SEU n, em um endereço diferente da pilha */
    printf("  ativação de fatorial(%d): &n = %p\n", n, (void *)&n);
    if (n <= 1)
        return 1;
    return n * fatorial(n - 1);
}

int main(void) {
    int valor = fatorial(3);          /* exemplo do livro (p. 425) */
    printf("fatorial(3) = %d\n", valor);
    return 0;
}
