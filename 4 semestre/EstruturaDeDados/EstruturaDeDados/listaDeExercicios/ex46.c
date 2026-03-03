#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    //Esse srand é para sempre ser um número aleatóro
    srand(time(NULL));
    //criação das variáveis 
    int *ptr;
    ptr=malloc(3*sizeof(int));//alocação dinamica de memória
    //verifica se a alocação foi ou não bem sucedida
    if(ptr == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    //For, colocar os numeros randomicos n array, usando sempre pensando [a, b]
    // Como por exemplo quero de 0 a 99, faço a + (rand()%(b-a+1)), usando essa regra sempre da certo
    for (int i = 0; i < 3; i++){
        *(ptr+i) = 0 + rand()%(99-0+1);
    }
    // Mostrar para o usuário o que foi aocado
    for (int i = 0; i < 3; i++){
        printf("%d\n",*(ptr+i));
    }

    free(ptr);
    return 0;
}