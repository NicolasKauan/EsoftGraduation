/* Aula 11 - Sem exceções: erros sinalizados por valores de retorno (Sebesta 14.1.1, p. 597-598)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc codigos_retorno.c -o codigos_retorno && ./codigos_retorno
 */
#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    FILE *f = fopen("nao_existe.txt", "r");       /* o erro vem no VALOR DE RETORNO */
    if (f == NULL)                                /* ...e só é tratado se alguém verificar */
        printf("fopen falhou: %s\n", strerror(errno));

    char *fim;
    long n = strtol("12abc", &fim, 10);           /* converte o que dá e aponta onde parou */
    printf("strtol: n = %ld, sobrou \"%s\"\n", n, fim);

    int r = atoi("abc");                          /* atoi nem consegue sinalizar erro: devolve 0 */
    printf("atoi(\"abc\") = %d\n", r);
    return 0;
}
