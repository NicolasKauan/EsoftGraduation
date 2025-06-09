#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*Implemente um programa em linguagem C que utilize alocação dinâmica de memória para criar
e preencher uma matriz de inteiros com dimensões 3x5, armazenando valores sequenciais de 0 a
15.
Após isso, o programa deve realocar dinamicamente a matriz para as novas dimensões 5x5,
preservando os dados já inseridos e preenchendo os novos elementos com os valores sequenciais
de 15 a 24.
O programa deve exibir a matriz ao usuário duas vezes:
1. Após o preenchimento da matriz 3x5.
2. Após a realocação e o preenchimento dos novos elementos na matriz 5x5.
Obs. Como a apresentação da matriz será efetuada duas vezes, utilize um procedimento*/

void mostrarMatriz(int **matriz, int linhas, int colunas);

int main(){
    //Declarações das variáveis
    int **m, i, j, x = 0;
    m = malloc(3*sizeof(int));
    if(m == NULL){
        printf("ERRO AO ALOCAR MATRIZ");
        return 0;
    }else{
        printf("\nSucesso ao alocar a matriz");
    }
    for (i = 0; i < 3; i++){
        m[i] = malloc(5*sizeof(int));
        if (m[i] == NULL){
            printf("Erro ao alocar a matriz");
            free(m);
            return 1;
        } else{
            printf("\nSucesso ao alocar a matriz");
        }
    }
    // Alocar os valores sequenciais na matriz(0 a 15)
    for (i = 0; i < 3; i++){
        for (j = 0; j < 5; j++){
            m[i][j] = x++;
        }
        printf("\n");
    }
    // 1 mostrar da matriz
    mostrarMatriz(m,3,5);
    m = realloc(m,5*sizeof(int*));
    if(m == NULL){
        printf("Erro na realocação de memoria");
        for (i = 0; i < 3; i++){
            free(m[i]);
        }
        free(m);
        return 1;
    }
    for (i = 3; i < 5; i++){
        m[i] = malloc(5*sizeof(int));
        if (m[i] == NULL){
            printf("Erro ao alocar a matriz");
            for (i = 0; i < 3; i++){
                free(m[i]);
            }
            free(m);
            return 1;
        } else{
            printf("\nSucesso ao alocar a matriz");
        }
    }
    // Alocar valores sequenciais na matriz(15 a 24)
    for (i = 3; i < 5; i++){
        for (j = 0; j < 5; j++){
            m[i][j] = x++;
        }
        printf("\n");
    }
    mostrarMatriz(m,5,5);
    for (i = 0; i < 5; i++){
        free(m[i]);
    }
    free(m);
    return 0;
}

void mostrarMatriz(int **matriz, int linhas, int colunas){
    for (int i = 0; i < linhas; i++){
        for (int j = 0; j < colunas; j++){
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }
    
}