#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void push(int item); //empilhar
void pop();
void imprimir();
int entrada_dados();

typedef struct apelido_no{
    int dado;
    struct apelido_no *proximo;
}no;

no *top=NULL;

int main(){
    int n,opcao;
    do{
        system("cls");
        printf("\nMENU\n1. EMPILHAR\n2. DESEMPILHAR\n3. IMPRIMIR\n4. SAIR");
        printf("\nEscolha uma opcao (0-4): ");
        scanf("%d", &opcao);
        switch (opcao){
        case 1:
            n=entrada_dados();
            // EMPILHAR
            push(n);
            break;
        case 2:
            // DESEMPILHAR
            pop();
            break;
        case 3:
            imprimir();
            break;
        default:
            break;
        }
    } while (opcao!=4);
    system("pause");
    return 0;
}

void push(int item){
    printf("\nEmpilhando...\n");
    no *novo=malloc(sizeof(no));
    if(novo!=NULL){
        printf("Deu certo!\n");
    } else{
        printf("Deu tudo errado!\n");
    }
    novo->dado=item;
    novo->proximo=top;
    top=novo;
    printf("\nVALOR %d empihado\n", novo->dado);
    system("pause");
} //empilhar
void pop(){
    printf("\nDesempilhando...\n");
    if(top==NULL){
        printf("A PILHA ESTA VAZIA\n");
    } else{
        no *temp;
        temp=top;
        top=top->proximo;
        printf("\n%d desempilhado \n",temp->dado);
        free(temp);
    }
    system("pause");
}
void imprimir(){
    no *temp;
    temp=top;
    printf("\nIMPRIMINDO PILHA...\n");
    while (temp != NULL){
        printf("%d\n", temp->dado);
        temp=temp->proximo;
    }
    system("pause");
}
int entrada_dados(){
    int valor; 
    printf("Informe um número: ");
    scanf("%d", &valor);
    return valor;
}