/* Aula 09 - Vinculação dinâmica "à mão" em C: registro de instância + vtable (Sebesta 12.5, p. 526-529)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc vtable.c -o vtable && ./vtable
 * É assim que o núcleo do Linux faz "polimorfismo" (por exemplo, struct file_operations).
 */
#include <stdio.h>

typedef struct Forma Forma;

typedef struct {                          /* a "vtable": ponteiros para os métodos */
    double (*area)(const Forma *);
    const char *(*nome)(void);
} VTable;

struct Forma {                            /* o "registro de instância": o 1º campo aponta para a vtable */
    const VTable *vtable;
    double a, b;
};

static double area_ret(const Forma *f) { return f->a * f->b; }
static double area_tri(const Forma *f) { return f->a * f->b / 2; }
static const char *nome_ret(void)      { return "retângulo"; }
static const char *nome_tri(void)      { return "triângulo"; }

static const VTable VT_RET = { area_ret, nome_ret };
static const VTable VT_TRI = { area_tri, nome_tri };

int main(void) {
    Forma formas[] = { { &VT_RET, 2, 3 }, { &VT_TRI, 2, 3 } };
    for (int i = 0; i < 2; i++) {
        const Forma *f = &formas[i];
        /* "despacho dinâmico": segue o ponteiro da vtable em tempo de execução */
        printf("%s: %.1f\n", f->vtable->nome(), f->vtable->area(f));
    }
    return 0;
}
