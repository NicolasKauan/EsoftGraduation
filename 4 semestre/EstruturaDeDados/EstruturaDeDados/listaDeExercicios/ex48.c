#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    //criação das variáveis 
    float *ptr;
    int tam;
    printf("Informe a quantidade de elementos que deseja criar: ");
    scanf("%d",&tam);
    ptr=malloc(tam*sizeof(float));//alocação dinamica de memória
    //verifica se a alocação foi ou não bem sucedida
    if(ptr == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    // Apresentação da quantidade de bytes alocados
    printf("Quantidade de bytes alocados e: %d",tam*sizeof(ptr));


    free(ptr);
    return 0;
}