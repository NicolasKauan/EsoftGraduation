#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    // Declaração das variáveis
    char vet[4][10];

    //Entrada de dados sendo eles 4 palavras com no maximo 10 letras
    for(int i = 0; i<4; i++){
            printf("Informe a %d palavra(com no maximo 10 caracteres): ",i+1);
            fgets(vet[i],sizeof(vet[i]),stdin);
    }
    //Mostrar o que está dentro do vetor 
    for(int i = 0; i<4; i++){
        printf("%s\n",vet[i]);
    }
    //O tamanho do vetor em bytes
    printf("O tamanho do vetor em bytes: %ld",sizeof(vet));
    // A quantidade de caracteres em cada elemento do vetor
    for (int i = 0; i < 4; i++){
        int elementoAtual = 0;
        for (int j = 0; j < strlen(vet[i]) ; j++){
        elementoAtual++;
        }
        printf("\nO elemento do vetor %s tem %d caracteres!\n",vet[i],(elementoAtual-1));
    }
    //Endereço de memória do vetor
    printf("Endereco de memoria do vetor: %p\n",&vet);
    // O endereço de memória de cada elemento do vetor
    for(int i = 0; i<4; i++){
        printf("Endereco de memoria: %p\n",&vet[i]);
    }
    // Exercicios 26 fazer o end. do vet e o end. de cada elemento com ponteiro
    char *ptr;
    ptr = vet;
    //Endereço de memória do vetor
    printf("Endereco de memoria do vetor: %p\n",&*ptr);
    // Endereco de memória de cada elemento do vetor
    for(int i = 0; i<4; i++){
        printf("Endereco de memoria: %p\n",&*(ptr+i));
    }

    return 0;
}