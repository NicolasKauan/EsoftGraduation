#include <stdio.h>
#include <stdlib.h>


int main(){
    int opcao; //opção para o MENU
    //(coloca a struct de entrada) dados; //dados é uma variável do tipo jogador
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
                //dados = entrada_dados(); //variável dados recebe informacoes do jogador
                //push(dados); //empilha dados do jogador
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