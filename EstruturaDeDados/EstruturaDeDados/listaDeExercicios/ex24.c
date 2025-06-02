#include <stdio.h>
#include <stdlib.h>


int main() {
    // Declaração das variáveis
    int n1[5];
    int *ptr;
    
    // For para entrada de dados via usuário e colocação no vetor
    for (int i = 0; i < 5; i++){
        printf("informe o %d numero: ",i+1);
        scanf("%d", &n1[i]);
    }

    // apontamento do ponteiro para o vetor após a entrada de dados
    ptr = n1;

    // For saida visual para o usuário via printf com aritmérica de ponteiros
    for (int i = 0; i < 5; i++){
        printf("%d|",*(ptr+i));
    }
    return 0;
}