#include <stdio.h>
#include <stdlib.h>

struct tp_ponto{
    float x;
    float y;
    struct tp_ponto *prox;
};


 typedef struct tp_ponto Ponto;



int main (){

    Ponto *p = (Ponto *)malloc(sizeof(Ponto));
    p->x = 1;
    p->y = 5;

    Ponto *p1 = (Ponto *)malloc(sizeof(Ponto));
    p1->x = 3;
    p1->y = 9;


    Ponto *p2 = (Ponto *)malloc(sizeof(Ponto));
    p2->x = 4;
    p2->y = 7;

    p->prox = p1;
    p1->prox = p2;
    p2->prox = NULL;

    printf("%.2f", p->x);
    printf("\n%.2f", p->prox->x);
    printf("\n%.2f", p->prox->prox->x);


    return 0;
}