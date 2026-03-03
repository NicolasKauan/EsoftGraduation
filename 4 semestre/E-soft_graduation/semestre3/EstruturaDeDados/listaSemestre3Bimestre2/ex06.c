#include <stdio.h>
#include <stdlib.h>


typedef struct{
    char nomes[30];
    int idade;
}pessoa;
typedef struct apelido {
    pessoa pessoa;
    
    struct apelido *proximo;
    
}no;

no *topo = NULL;

void push(pessoa p);
void pop();
void mostrarPilha();
void limparPilha();
pessoa entradaDados();

int main(){
    int opcao; //opção para o MENU
    pessoa dados; //dados é uma variável do tipo jogador
    do {
        system("cls");
        printf("\nMenu - Pilha de Jogadores");
        printf("\n1. Empilhar Jogador");
        printf("\n2. Desempilhar Jogador");
        printf("\n3. Apresenta Pilha");
        printf("\n4. Limpar Memória");
        printf("\n5. Sair");
        printf("\nOpcao: ");
        scanf("%d", &opcao);
        fflush(stdin); // limpa buffer do teclado

        switch (opcao) {
            case 1:
                dados = entradaDados(); //variável dados recebe informacoes do jogador
                push(dados); //empilha dados do jogador
                break;
            case 2:
                pop(); //desempilha o jogador do topo
                break;
            case 3:
                mostrarPilha(); //apresenta a pilha toda
                break;
            case 4:
                limparPilha();
                break;
            case 5:
                break;
            default:
                printf("Opção inválida");
                           
        }
        system("pause");
    } while (opcao != 5);

    limparPilha(); // limpeza final
    printf("\nFim do programa.\n");
    system("pause");
    return 0;
}
void push(pessoa p){
    no *novo = malloc(sizeof(no));
    if(novo){
        novo->pessoa = p;
        novo->proximo = topo;
        topo = novo;
        printf("A pessoa %s foi empilhada com sucesso\n",p.nomes);
    }else{
        printf("Nao foi possivel alocar a memoria do novo\n");
        system("pause");
    }
}
void pop(){
    if(topo==NULL){
        printf("A pilha está vazia\n");
    } else{
        no *aux;
        aux = topo;
        topo = topo->proximo;
        free(aux);
        printf("Desempilhado com sucesso\n");
    }
}
void mostrarPilha(){
    no *temp;
    temp=topo;
    if(topo==NULL){
        printf("A pilha esta vazia...\n");
    }
    printf("\nImprimindo pilha...\n");
    while (temp!=NULL){
        printf("Nome: %s\nIdade: %d\n",temp->pessoa.nomes, temp->pessoa.idade);
        temp = temp->proximo;
    }
}
void limparPilha(){
    while (topo){
        pop();
    }
}
pessoa entradaDados(){
    pessoa p;
    printf("\n cadastro de pessoa:\n");
    printf("Informe seu nome: ");
    scanf("%s",&p.nomes);
    fflush(stdin);
    printf("Informe sua idade: ");
    scanf("%d",&p.idade);
    fflush(stdin);
    return p;
}




