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

    return n;
}

void add(Nodo *n, int valor){
    if(valor < n->valor){
        if(n->esq == NULL){
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

void imprimir(Nodo *n){
    if(n==NULL){
        return;
    }
    imprimir(n->esq);
    printf("\n Valor: %d\n",n->valor);
    imprimir(n->dir);
}

int main(void){
    Nodo *root = create(5);
    add(root, 2);
    add(root, 0);
    add(root, 1);
    add(root, 8);
    add(root, 4);

    // 2. Acessando o 4 pela raiz
    printf("Questao 2: %d\n", root->esq->dir->valor);




    return 0;
}