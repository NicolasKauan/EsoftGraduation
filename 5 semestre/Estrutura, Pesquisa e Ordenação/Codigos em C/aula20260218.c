#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <Windows.h>
#include <conio.h>
#include <stdbool.h>

int op;
int prox = 0;
bool sair = false;

typedef struct{
    int codigo;
    char nome[100];
} tp_aluno;
tp_aluno alunos[100];

void menu(){
    system("cls");
    printf("=== MENU ===\n");
    printf("1 - Cadastrar\n");
    printf("2 - Listar\n");
    printf("3 - Remover\n");
    printf("4 - Buscar\n");
    printf("5 - Sair do Sistema\n");
}

void cadastrar(){
    system("cls");
    if(prox >= 100){
        printf("Cadastro cheio...");
        system("pause");
    }else{
        printf("Digite o codigo: ");
        scanf("%d", &alunos[prox].codigo);
        printf("Digite o nome: ");
        fflush(stdin);
        fgets(alunos[prox].nome, 100, stdin);
        prox++;
    }
}

void listar(){
    int i;
    system("cls");
    for(i=0; i<prox; i++){
        printf("-----Dados do aluno------\n");
        printf("Codigo: %d\n", alunos[i].codigo);
        printf("Nome: %s\n", alunos[i].nome);
        printf("-------------------------\n");
    }
    system("pause");
}

void remover(){
    system("cls");
    int codigo;
    bool localizado = false;
    printf("Digite o codigo a ser removido: \n");
    scanf("%d", &codigo);

    for(int i=0; i<prox; i++){
        if(codigo == alunos[i].codigo){
            alunos[i].codigo = alunos[prox-1].codigo;
            strcpy(alunos[i].nome, alunos[prox-1].nome);
            prox--;
            localizado = true;
        }
    }

    if(!localizado){
        printf("Aluno não encontrado!\n");
    }
    system("pause");
}

void buscar(){
    system("cls");
    int codigo;
    bool localizado = false;
    printf("Digite o codigo a ser localizado: \n");
    scanf("%d", &codigo);
    for(int i=0; i < prox; i++){
        if(codigo == alunos[i].codigo){
            printf("-----Dados do aluno------\n");
            printf("Codigo: %d\n", alunos[i].codigo);
            printf("Nome: %s\n", alunos[i].nome);
            printf("-------------------------\n");
            localizado = true;
        }
    }
    if(!localizado){
        printf("Aluno não encontrado!\n");
    }
    system("pause");
}

void sairDoSistema(){
    printf("Saindo do sistema...\n");
    sair = true;
}

int main(){
    setlocale(LC_ALL, "Portuguese");

    while(sair == false){
        menu();
        scanf("%d", &op);
        switch(op){
            case 1:
                cadastrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                remover();
                break;
            case 4:
                buscar();
                break;
            case 5:
                sairDoSistema();
                break;
            default:
                printf("Opcao invalida!\n");
                system("pause");
                break;
        }
    }




    return 0;
}