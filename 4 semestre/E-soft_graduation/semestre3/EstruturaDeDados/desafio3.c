//Desafio é saber quanta memória temos atualmente para alocar, jeito que irei tentar é ir alocando até NULL
#include <stdio.h>
#include <stdlib.h>

int main(){
    long int tamDaMemoria = 1024;
    int *memoria;
    float total;
    while ((memoria = malloc(tamDaMemoria)) != NULL){
        tamDaMemoria+=1024;
    }
    free(memoria);
    total = tamDaMemoria/1024;
    printf("A quantidade de memoria disponivel e: %.2fmb",total);
    return 0;
}