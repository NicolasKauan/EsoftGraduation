#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
//struct para a entrada de dados do personagem
typedef struct {
    char nome[50]; // Nome do Jogador Ex: Moreno
    int idade; // Idde do jogador Ex: 41
    char classe[20]; // Classe do Jogador Ex: "Guerreiro", "Mago", etc.
} personagem;
//------------------------------------------------------------------------------
// struct para a entrada de dados do jogador mas temos uma herança de variáveis da struct anterior
typedef struct {
    int nivel; // Nível do jogador no jogo Ex: 12
    int experiencia; // Pontuação de experiência Ex: 890
    personagem p; // Dados do personagem
} jogador;
//------------------------------------------------------------------------------
// É aqui que a magica começa, temos a struct do no mas antes precisamos do "apelido", por conta que precisamos do ponteiro "proximo" 
// para o restando do código
typedef struct apelido {
    jogador jog; //jog é uma variável do tipo jogador
    struct apelido *proximo; //*proximo é um ponteiro do nó
} no;
//------------------------------------------------------------------------------
no *topo = NULL; //topo é ponteiro que indica o TOPO da pilha

void push(jogador j);     // procedimento Empilhar
void pop();               // procedimento Desempilhar
void mostra_pilha();      // procedimento Imprimir pilha
void liberar_pilha();     // procedimento Limpar memória
jogador entrada_dados();  // função Entrada de dados que retorna dados do jogador

//-------------------------------------------
int main() {
    setlocale(LC_ALL, ""); //ativa teclado padrão do windows
    int opcao; //opção para o MENU
    jogador dados; //dados é uma variável do tipo jogador
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
                dados = entrada_dados(); //variável dados recebe informacoes do jogador
                push(dados); //empilha dados do jogador
                break;
            case 2:
                pop(); //desempilha o jogador do topo
                break;
            case 3:
                mostra_pilha(); //apresenta a pilha toda
                break;
            case 4:
                liberar_pilha();
                break;
            case 5:
                break;
            default:
                printf("Opção inválida");
                           
        }
        system("pause");
    } while (opcao != 5);

    liberar_pilha(); // limpeza final
    printf("\nFim do programa.\n");
    system("pause");
    return 0;
}
//-------------------------------------------
void push(jogador j) {
    /*
    o ponteiro novo foi criado e iremos utiliza-lo como uma variável local sempre criada a cada push
    iremos tem uma alocação dinamica de memória para sua alocação do tamanho no nó
    */
    no *novo =malloc(sizeof(no));
    if(novo){//se novo!=NULL ele segue para cá
        novo->jog = j;//temos aqui que novo.jog = j, ou seja aquilo da entrada de dados será guardada agora na variável jog
        novo->proximo = topo;//agora o ponteiro proximo vai receber o endereço do topo que na primeira interação é null
        topo = novo;//ai o topo vai receber o endereço de novo 
        printf("\nJogador %s empilhado com sucesso!\n", j.p.nome);
    }else{//se novo==NULL deu erro e tem que parar
        printf("Erro ao alocar a memoria\n");
        system("pause");
    }
}
//-------------------------------------------
void pop() {
    if(topo==NULL){//topo for igual a null a pilha está vazia 
        printf("A pilha esta vazia\n");
    } else{
        no *temp;//criação da variável temp para quardar o endereço
        temp=topo;//aqui vemos que o end de topo será guardado em temp
        topo = topo->proximo;//o topo vai recebe o end do proximo
        printf("\nDesempilhado com sucesso\n\n");
        free(temp);//e aqui vamos liberar o temp "apagando" assim o topo anterior
    }
}
//-------------------------------------------
void mostra_pilha() {
    no *temp;
    temp=topo;
    printf("\nIMPRIMINDO PILHA...\n");
    while (temp!=NULL){
        printf("Nome: %s\nIdade: %d\nClasse: %s\nNivel: %d\nExperiencia: %d\n",temp->jog.p.nome,temp->jog.p.idade,temp->jog.p.classe,temp->jog.nivel,temp->jog.experiencia);
        printf("-------------------------------------------------\n");
        temp=temp->proximo;
    }
    if(temp==NULL){
        printf("A pilha está vazia\n");
    }
}
//-------------------------------------------
void liberar_pilha() {
    while(topo!=NULL){
        pop();
    }
    printf("\nMemória liberada com sucesso.\n");
}
//-------------------------------------------
jogador entrada_dados() {
    jogador jog;
    printf("\nCadastro do Jogador:\n");
    // entrada de dados começando no nome
    printf("Nome: ");
    scanf("%s",&jog.p.nome);
    fflush(stdin);
    //entrada de dados idade
    printf("Idade: ");
    scanf("%d",&jog.p.idade);
    fflush(stdin);
    //entrada de dados Classe
    printf("Classe: ");
    scanf("%s",&jog.p.classe);
    fflush(stdin);
    //entrada de dados Nivel
    printf("Nivel: ");
    scanf("%d",&jog.nivel);
    fflush(stdin);
    //entrada de dados Idade
    printf("Experiencia: ");
    scanf("%d",&jog.experiencia);
    fflush(stdin);
    return jog;
}