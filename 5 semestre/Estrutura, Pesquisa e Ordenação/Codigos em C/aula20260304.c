#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <Windows.h>
#include <conio.h>
#include <stdbool.h>

struct tp_produto{
    int codigo;
    char nome[100];
    struct tp_produto *prox;
};

typedef struct tp_produto Produto;

//o topo da pilha sempre começa como NULL
Produto * topo = NULL;

//Inserção (Push/empilhar): o novo elemento vira o novo topo
void empilhar(){
    Produto *produto = (Produto*) malloc(sizeof(Produto));
    printf("Digite o codigo: ");
    scanf("%d", &produto->codigo);
    printf("Digite o nome: ");
    fflush(stdin);
    gets(produto->nome);
    produto->prox = topo;
    topo = produto;
    printf("Produto cadastrado com sucesso!\n");
    system("pause");
}

//Remoção (Pop/desempilhar): o elemento do topo é removido e o próximo elemento vira o novo topo
void listar(){
    Produto *aux = topo;
    printf("\n=== Lista de Produtos ===\n");
    while(aux != NULL){
        printf("Codigo: %d\n", aux->codigo);
        printf("Nome: %s\n", aux->nome);
        printf("-------------------------\n");
        aux = aux->prox;
        
    }
    printf("========================\n");
    system("pause");
}

//Busca: percorre a pilha do topo até o final para encontrar um elemento específico
void desempilhar(){
    if(topo == NULL){
        printf("A pilha está vazia!\n");
        return;
    } else{
        Produto *aux = topo;
        topo = topo->prox;
        free(aux);
        printf("Produto desempilhado com sucesso!\n");
        system("pause");
    }
}


int main(){
    empilhar();
    system("cls");
    empilhar();
    system("cls");
    empilhar();
    system("cls");

    printf("\n O topo da pilha é: %s\n", topo->nome);
    listar();
    system("cls");
    desempilhar();
    system("cls");
    listar();
    system("cls");
    return 0;
}





