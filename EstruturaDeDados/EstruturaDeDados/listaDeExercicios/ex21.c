#include <stdio.h>
#include <stdlib.h>

//referencia da função no começo do código
void troca (int *a, int *b);


int main (){
    // Passagem das variaveis
    int n1 = 10, n2 = 30;

    // Passagem das variáveis para a função
    troca(&n1,&n2);

    //saida para o usuário
    printf("N1=%d\n",n1);
    printf("N2=%d",n2);

    return 0;
}

//função para troca dos valores
void troca (int *a, int *b){
    int tmp;
    tmp = *a;
    *a = *b;
    *b = tmp;
}





















