/* Aula 06 - Uniões livres (Sebesta 6.10.2, p. 271)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc uniao_livre.c -o uniao_livre && ./uniao_livre
 */
#include <stdio.h>

union flexType {            /* exemplo do próprio Sebesta, p. 271 */
    int   intEl;
    float floatEl;
};

enum Etiqueta { ETQ_INT, ETQ_FLOAT };

struct Valor {              /* "união discriminada" feita à mão: etiqueta + união */
    enum Etiqueta etiqueta;
    union flexType v;
};

int main(void) {
    union flexType el1;
    el1.intEl = 27;
    float x = el1.floatEl;             /* nenhuma verificação: lê os bits de 27 como float */
    printf("x = %g\n", x);             /* ~3.78351e-44: lixo */

    el1.floatEl = 1.0f;
    printf("intEl = %d\n", el1.intEl); /* 1065353216: os bits de 1.0f lidos como int */
    printf("sizeof = %zu\n", sizeof(union flexType)); /* 4: os campos dividem a memória */

    struct Valor val;
    val.etiqueta = ETQ_FLOAT;
    val.v.floatEl = 2.5f;
    if (val.etiqueta == ETQ_FLOAT)     /* a verificação existe, mas depende do programador */
        printf("float %g\n", val.v.floatEl);
    return 0;
}
