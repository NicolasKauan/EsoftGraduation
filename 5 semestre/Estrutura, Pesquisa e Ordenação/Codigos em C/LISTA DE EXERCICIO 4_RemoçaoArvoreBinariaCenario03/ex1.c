#include <stdio.h>
#include <stdlib.h>

struct nodo{
    int valor;
    struct nodo *esq;
    struct nodo *dir;
};

typedef struct nodo Nodo;

Nodo* create(int valor){
    Nodo *n = (Nodo*)malloc(sizeof(Nodo));
    n->valor = valor;
    n->esq = NULL;
    n->dir = NULL;
}

void imprimir(Nodo *n){
    if(n==NULL){
        return;
    }
    imprimir(n->esq);
    printf("\n Valor: %d \n", n->valor);
    imprimir(n->dir);
}


void add(Nodo *n, int valor){
    if(valor < n->valor){
        if (n->esq == NULL){
            n->esq = create(valor);
        } else{
            add(n->esq, valor);
        }
    } else{
        if(n->dir == NULL){
            n->dir = create(valor);
        } else{
            add(n->dir, valor);
        }
    }
}

void rem(Nodo *n, int valor){




    

}

int main(void){





    return 0;
}