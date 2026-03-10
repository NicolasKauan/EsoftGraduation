#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <Windows.h>
#include <conio.h>
#include <stdbool.h>

struct tp_aluno{
    int codigo;
    char nome[100];
    struct tp_aluno *prox;
};

typedef struct tp_aluno Aluno ;

Aluno * topo = NULL;

void empilhar(){
    Aluno *aluno = (Aluno*) malloc(sizeof(Aluno));
    printf("Digite o codigo: ");
    scanf("%d", &aluno->codigo);
    printf("Digite o nome: ");
    fflush(stdin);
    gets(aluno->nome);
    aluno->prox = topo;
    topo = aluno;
};
void listar(){
    Aluno *aux = topo;
    printf("\n=== Lista de Alunos ===\n");
    while(aux != NULL){
        printf("Codigo: %d\n", aux->codigo);
        printf("Nome: %s\n", aux->nome);
        printf("-------------------------\n");
        aux = aux->prox;
        
    }
    printf("========================\n");
};
void desempilhar(){
    if(topo == NULL){
        printf("A pilha está vazia!\n");
        return;
    } else{
        Aluno *aux = topo;
        topo = topo->prox;
        free(aux);
        printf("Aluno desempilhado com sucesso!\n");
    }
};


void menu(){
    printf("=== Menu de Opções ===\n");
    printf("1. Empilhar (Push)\n");
    printf("2. Desempilhar (Pop)\n");
    printf("3. Listar\n");
    printf("4. Sair\n");
    printf("=====================\n");
    printf("Escolha uma opção: ");
}

int main(){
    int opcao;
    do{
        menu();
        scanf("%d", &opcao);
        switch(opcao){
            case 1:
                empilhar();
                break;
            case 2:
                desempilhar();
                break;
            case 3:
                listar();
                break;
            case 4:
                printf("Saindo do programa...\n");
                break;
            default:
                printf("Opção inválida! Tente novamente.\n");
        }
    }while (opcao != 4);
    return 0;
}