/* Aula 09 - "TAD" em C sem ocultação: o cliente quebra a representação (Sebesta 11.6.2, p. 475-476)
 * Online: https://onecompiler.com/c  (cole o código inteiro)
 * Local:  gcc pilha_c.c -o pilha_c && ./pilha_c
 * Em C, a ocultação só é possível separando .h e .c com um tipo opaco (struct declarada sem campos).
 */
#include <stdio.h>

typedef struct {
    int dados[10];
    int topo;             /* invariante: -1 <= topo < 10 e dados[0..topo] válidos */
} Pilha;

void criar(Pilha *p)           { p->topo = -1; }
void empilhar(Pilha *p, int x) { if (p->topo < 9) p->dados[++p->topo] = x; }
int  topo(const Pilha *p)      { return p->dados[p->topo]; }

int main(void) {
    Pilha p;
    criar(&p);
    empilhar(&p, 42);
    printf("42 is: %d\n", topo(&p));
    p.topo = 7;                        /* o cliente mexe DIRETO na representação! */
    printf("lixo:  %d\n", topo(&p));   /* dados[7] nunca foi escrito: valor indefinido */
    return 0;
}
