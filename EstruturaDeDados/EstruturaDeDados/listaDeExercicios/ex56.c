#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*Implemente um programa em linguagem C que preencha um vetor com 5 elementos contendo
nomes. A alocação dos nomes deverá ser feita de acordo com seu tamanho, ou seja, se o nome
for “JOSE” a alocação deverá ser de tamanho 5 (4+1). Se o nome for “MARIANA”, a alocação
naquela posição do vetor deverá ser de tamanho 8 (7+1). Apresente no final o endereço do
vetor, o conteúdo de cada elemento do vetor, bem como seu respectivo endereço de memória.*/

int main() {
    // Declaração das variáveis
    char ***ptr;
    char nomes[5][8] = {"Jose","ana", "mariana", "rosa","Nicolas"};
    int i, j, x = 0;

    //Primeira alocação de memória para seu uso na matriz de string 
    ptr = malloc(1*sizeof(int));

    //Aqui é onde a magica acontece um pouco, porque aqui que alocamos a memória para cada um dos 5 vetores anteriores sendo eles
    // o numero ao qual queremos que seja a matriz, aqui estou fazendo uma matriz "perfeita" de 5x5 
    for(i=0; i<1; i++){
        ptr[i] = malloc(5*sizeof(int));
        for (j = 0; j <5; j++){
            ptr[i][j] = malloc(strlen(nomes[x]) + 1);
            strcpy(ptr[i][j], nomes[x++]);
        }
        
    }
    //Apresentação para o usuário
    for (i = 0; i < 1; i++){
        for (j = 0; j<5; j++){
         printf("%s ",ptr[i][j]);   
        }
        printf("\n");
    }

    //liberando a memória
    for (i = 0; i < 1; i++){
        free(ptr[i]);
        for ( j = 0; j <5; i++){
            free(ptr[i][j]);
        }
    }
    free(ptr);
    return 0; 
}