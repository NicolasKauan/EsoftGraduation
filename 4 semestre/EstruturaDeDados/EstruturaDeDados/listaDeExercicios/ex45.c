#include <stdio.h>
#include <stdlib.h>


int main() {
    float *ptr;
    ptr=malloc(3*sizeof(float));
    if(ptr == NULL){
        printf("ERRO AO ALOCAR A MEMORIA\n");
        return 1;
    }else{
        printf("Memoria alocada com sucesso\n");
    }
    for (int i = 0; i < 3; i++){
        printf("Informe o %d numero: ",i+1);
        scanf("%f",&ptr[i]);
    }
    for (int i = 0; i < 3; i++){
        printf("%f\n",*(ptr+i));
    }

    free(ptr);
    return 0;
}