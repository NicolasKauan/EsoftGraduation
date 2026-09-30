/* Aula 07 - Aninhamento de seletores: o "else pendente" (Sebesta 8.2.1.4, p. 331-333)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc else_pendente.c -o else_pendente && ./else_pendente
 */
#include <stdio.h>

int main(void) {
    int sum = 0, count = 5, result = -1;
    if (sum == 0)
        if (count == 0)
            result = 0;
    else                      /* a endentação engana: este else pertence ao if INTERNO */
        result = 1;
    printf("result = %d\n", result);   /* 1 */

    result = -1;
    if (sum == 0) {           /* com chaves, o else passa a ser do if externo */
        if (count == 0)
            result = 0;
    } else
        result = 1;
    printf("result = %d\n", result);   /* -1 */
    return 0;
}
