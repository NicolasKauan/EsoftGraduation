#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    //Esse srand é para sempre ser um número aleatóro
    srand(time(NULL));
    //criação das variáveis 
    int *ptr;
    int *enderecoAnterior; 
    ptr=malloc(10*sizeof(int));//alocação dinamica de memória
    //verifica se a alocação foi ou não bem sucedida
    if(ptr == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    //For, colocar os numeros randomicos n array, usando sempre pensando [a, b]
    // Como por exemplo quero de 0 a 99, faço a + (rand()%(b-a+1)), usando essa regra sempre da certo
    for (int i = 0; i < 10; i++){
        *(ptr+i) = 20 + rand()%(50-20+1);
    }
    // Mostrar para o usuário o que foi alocado antes de redimencionar
    for (int i = 0; i < 10; i++){
        printf("%d\n",*(ptr+i));
    }
    // guardando o endereço anterior 
    enderecoAnterior = ptr;
    printf("\n Endereco original: %p\n", enderecoAnterior);
    printf("----------------------------------------\n");
    // Realocacao para 20 agora, colocando em um novo ponteiro
    int *novo_ptr=realloc(ptr,20*sizeof(int));
    // verificacao para ver se o realloc funcinou
    if(novo_ptr == NULL){
        printf("ERRO AO REALOCAR A MEMORIA\n");
        free(ptr);
        return 1;
    }

    ptr = novo_ptr;

    // guardando o endereço atual
    printf("\n Endereco atual: %p\n", ptr);
    if(ptr == enderecoAnterior){
        printf("Nao foi mudado o bloco de endereco\n");
    } else{
        printf("O bloco foi mudado de endereco\n");
    }
    // Mostrar para o usuário
    for (int i = 0; i < 20; i++){
        printf("%d\n",*(ptr+i));
    }
    free(ptr);
    return 0;
}