/* Aula 07 - Laço lógico que nunca termina: o bug do Zune (31/12/2008) (Sebesta 8.3.2, p. 345-347)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc zune.c -o zune && ./zune
 * Versão simplificada do código que travou os tocadores Zune da Microsoft
 * no último dia de 2008, um ano bissexto.
 */
#include <stdio.h>

int bissexto(int ano) {
    return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
}

int main(void) {
    int dias = 366;       /* 31/12/2008 é o 366º dia do ano */
    int ano = 2008;
    long voltas = 0;      /* contador só para a demonstração parar */

    while (dias > 365) {
        if (bissexto(ano)) {
            if (dias > 366) {
                dias -= 366;
                ano += 1;
            }             /* com dias == 366, nada muda: o laço nunca termina */
        } else {
            dias -= 365;
            ano += 1;
        }
        if (++voltas == 1000000) {
            printf("laço infinito! dias=%d ano=%d depois de %ld voltas\n", dias, ano, voltas);
            return 1;
        }
    }
    printf("ano = %d\n", ano);
    return 0;
}
