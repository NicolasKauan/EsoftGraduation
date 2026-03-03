#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    //Esse srand é para sempre ser um número aleatóro
    srand(time(NULL));
    //criação das variáveis 
    int *ptr;
    ptr=malloc(7*sizeof(int));//alocação dinamica de memória
    //verifica se a alocação foi ou não bem sucedida
    if(ptr == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    //For, colocar os numeros randomicos n array, usando sempre pensando [a, b]
    // Como por exemplo quero de 0 a 99, faço a + (rand()%(b-a+1)), usando essa regra sempre da certo
    for (int i = 0; i < 7; i++){
        *(ptr+i) = 10 + rand()%(30-10+1);
    }
    // Mostrar para o usuário o que foi alocado antes de redimencionar
    for (int i = 0; i < 7; i++){
        printf("%d\n",*(ptr+i));
    }
    printf("----------------------------------------\n");
    // Realocacao para 15 agora
    ptr=realloc(ptr,5*sizeof(int));
    // Mostrar para o usuário, o vetor realocado a 5 e seu endereço de memória
    for (int i = 0; i < 5; i++){
        printf("%d\n",*(ptr+i));
        printf("%p\n",&*(ptr+i));
    }
    free(ptr);
    return 0;
}