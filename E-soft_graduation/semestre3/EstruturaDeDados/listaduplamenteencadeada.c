#include <stdio.h>
#include <stdlib.h>

typedef struct apelido{
    int val;
    struct apelido *ant;
    struct apelido *prox;
} no;

no *lista = NULL;
void inserir_inicio( no **lista, int num);

int main(){
    
    
    
    return 0;
}

void inserir_inicio( no **lista, int num){
    no *novo = malloc(sizeof(no));
    if(*lista == NULL){
        novo->val = num;
        novo->ant = NULL;
        novo->prox = NULL;
        *lista = novo;
    }
    else{
        novo->val = num;
        novo->ant = NULL;
        novo->prox = *lista;
        (*lista)->ant = novo;
        *lista = novo;
    }
}



