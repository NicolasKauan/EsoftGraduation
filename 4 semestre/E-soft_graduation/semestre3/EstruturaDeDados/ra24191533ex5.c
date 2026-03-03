#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void exiVetor(int *v, int tam);
int repet(int *v, int tam, int num);

int main() {
    int *v;
    int tam = 10, tam2 = 15, tam3 = 8, i;

    srand(time(NULL));

    v = malloc(tam * sizeof(int));
    if (!v) {
        printf("Falha ao alocar memória!\n");
        return 1;
    }

    printf("Memória alocada com sucesso!\n");
    for (i = 0; i < tam; i++) {
        int num; 
        do
        {
            num = rand() % 91 + 10;
        } while (repet(v,tam,num));
        *(v+i) = num;
    }
    printf("-------------------------------------------\n");
    printf("Endereço de memória do vetor(v): %p\n", (void *)v);
    exiVetor(v, tam);
    int *x = realloc(v, tam2 * sizeof(int));
    if (x) {
        v = x;
        for (i = tam; i < tam2; i++) {
            int num; 
            do
            {
                num = rand() % 100 + 100;
            } while (repet(v,tam2,num));
            *(v+i) = num;
            printf("%d \n", *(v + i));
        }
        printf("-------------------------------------------\n");
        exiVetor(v, tam2);
    } else {
        printf("Erro ao realocar memória!\n");
        free(v);
        return 1;
    }
    x = realloc(v, tam3 * sizeof(int));
    if (x) {
        v = x;
        exiVetor(v, tam3);
    } else {
        printf("Erro ao reduzir a memória!\n");
        free(v);
        return 1;
    }

    free(v);
    return 0;
}

void exiVetor(int *v, int tam) {
    for (int i = 0; i < tam; i++) {
        printf("Elemento %d: Valor = %d, Endereço = %p\n", i, *(v + i), (void *)(v + i));
    }
    printf("-------------------------------------------\n");
}

int repet(int *v, int tam, int num){
    for (int i = 0; i < tam; i++){
        if(v[i] == num){
            return 1;
        }
    }
    return 0;
}
