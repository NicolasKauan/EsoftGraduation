#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    //Esse srand é para sempre ser um número aleatóro
    srand(time(NULL));
    //criação das variáveis 
    int *vet1;
    int *vet2;
    vet1=malloc(5*sizeof(int));//alocação dinamica de memória
    //verifica se a alocação foi ou não bem sucedida
    if(vet1 == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    printf("ALOCACAO DO VET1 COM MALLOC\n");
    for (int i = 0; i < 5; i++){
        printf("%d\n",*(vet1+i));
    }
    vet2=calloc(5,sizeof(int));//alocação dinamica de memória
    if(vet2 == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    printf("ALOCACAO DO VET2 COM CALLOC\n");
    for (int i = 0; i < 5; i++){
        printf("%d\n",*(vet2+i));
    }
    free(vet1);
    free(vet2);
    return 0;
}