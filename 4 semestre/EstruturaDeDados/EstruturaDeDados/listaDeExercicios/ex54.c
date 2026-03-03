#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    // Para sempre ter numeros aleatórios
    srand(time(NULL));
    //Declaração da variávies
    int **mat, i, j;
    // alocação da memória para o ponteiro de ponteiro, com 5 espaços  inteiros
    mat = malloc(5*sizeof(int));
    // verificação para ver se ta tudo certo
    if(mat == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    // primeiro for para alocar agora para espaços 4 inteiros por linha
    for (i = 0; i < 5; i++){
        mat[i] = malloc(4*sizeof(int));
    }
    //agora preenchendo a matriz com os numeros aleatórios de 100 a 200
    for ( i = 0; i < 5; i++){
        for ( j = 0; j < 4; j++){
            mat[i][j] = 100 + rand()%(200-100+1); 
        }
    }
    // mostrando para o usuário a matriz 
    for ( i = 0; i < 5; i++){
        for ( j = 0; j < 4; j++){
            printf("%4d ",mat[i][j]);
        }
        printf("\n");
    }
    //realizando a liberação da memória alocada
    for ( i = 0; i < 5; i++){
       free(mat[i]);//realizando a liberação linha por linha 
    }
    free(mat);
    return 0;
}