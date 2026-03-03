#include <stdio.h>
#include <stdlib.h>

// Referencia das funções no começo do código
void mostra(int k[], int tam);
void altera(int k[], int tam);

int main (){
    //Passagem das variávies 
    int vet[]={12,15,14,45};
    int tam=sizeof(vet)/sizeof(int);
    // Primeira passagem da função mostra 
    mostra(vet,tam);
    // Passagem da função altera, passando as variáveis por referencia
    altera(vet,4);
    // Segunda passagem da função mostra
    mostra(vet,tam);
    // pulando duas linhas
    printf("\n\n");
    return 0;
}

//A funcão mostra simplesmente irá printar o vetor atual para o usuário
void mostra(int k[], int tam){
    int i;
    for (i = 0; i < tam; i++){
        printf("%d ",k[i]);
        printf("\n");
    }
    
}
// A funçao altera devera alterar todos os itens do vetor para o seu dobro
void altera(int k[], int tam){
    int i;
    for(i=0; i<tam; i++){
        k[i]=k[i]*2;
    }

}