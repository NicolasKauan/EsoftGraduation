#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void inverte (char x[],int tam);

int main() {
    char vet[8] = "Nicolas";
    printf("Palavra original: %s\n",vet);
    inverte(vet,strlen(vet));
    printf("Palavra invertida: %s",vet);
    return 0;
}

void inverte (char x[],int tam){
    int inicio = 0;
    int fim = tam-1;
    char temp;
    while (inicio < fim){
        temp = x[inicio];
        x[inicio] = x[fim];
        x[fim] = temp;
        inicio++;
        fim--;
    }
}