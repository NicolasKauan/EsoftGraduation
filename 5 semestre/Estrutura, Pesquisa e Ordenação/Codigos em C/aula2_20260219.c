#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int codigo;
    char nome[20];
    struct tp_produto *prox;
}tp_produto;

tp_produto *primeiroLista;

void addLast(){
    tp_produto *produto = (tp_produto *)malloc(sizeof(tp_produto));
    printf("Digite o codigo do produto: ");
    scanf("%d", &produto->codigo);
    printf("Digite o nome do produto: ");
    fflush(stdin);
    fgets(produto->nome,100,stdin);
    if(primeiroLista == NULL){
        primeiroLista = produto;
    }else{
        tp_produto *aux = primeiroLista;
        while(aux->prox != NULL){
            aux = aux->prox;
        }
        aux->prox = produto;
    }
    system("cls");
}

void imprime(tp_produto *aux){
    if(aux != NULL){
        printf("Codigo: %d\n", aux->codigo);
        printf("Nome: %s\n", aux->nome);
        imprime(aux->prox);
        if(aux->prox == NULL){
            printf("Fim da lista\n");
        } else{
            //printf("Próximo produto: %d\n", aux->prox->codigo);
        }   
    }

}

int main(){
    addLast();
    imprime(primeiroLista);

}