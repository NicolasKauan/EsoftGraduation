/* Aula 08 - Variáveis locais dinâmicas da pilha x estáticas (Sebesta 9.4.1, p. 373-375)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc estatica.c -o estatica && ./estatica
 */
#include <stdio.h>

int contador_automatico(void) {
    int n = 0;            /* dinâmica da pilha: recriada a cada chamada */
    n++;
    return n;
}

int contador_estatico(void) {
    static int n = 0;     /* estática: guarda o valor entre chamadas ("sensível ao histórico") */
    n++;
    return n;
}

int main(void) {
    for (int i = 0; i < 3; i++) {
        int a = contador_automatico();
        int e = contador_estatico();
        printf("automático = %d   estático = %d\n", a, e);
    }
    return 0;
}
