/* Aula 07 - Desvio incondicional: o bug "goto fail" da Apple (2014) (Sebesta 8.4, p. 352-353)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc goto_fail.c -o goto_fail && ./goto_fail
 * Versão simplificada: no código real (sslKeyExchange.c), uma linha "goto fail;"
 * duplicada fazia o iOS e o macOS aceitarem certificados com assinatura falsa.
 */
#include <stdio.h>

int verifica_hash(void)       { return 0; }    /* 0 = ok */
int verifica_assinatura(void) { return -1; }   /* -1 = assinatura FALSA */

int valida_certificado(void) {
    int err;
    if ((err = verifica_hash()) != 0)
        goto fail;
        goto fail;                     /* linha duplicada: desvia SEMPRE */
    if ((err = verifica_assinatura()) != 0)
        goto fail;                     /* nunca é alcançada */
fail:
    return err;                        /* err ainda vale 0 = "válido" */
}

int main(void) {
    printf("resultado = %d (0 significa certificado válido)\n", valida_certificado());
    return 0;
}
