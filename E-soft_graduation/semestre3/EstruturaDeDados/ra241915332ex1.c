#include <stdio.h>


int main(){
    float doacao, total=0;
    int x = 1; 
    do{
        printf("%d pessoal, valor da doacao: ",x);
        scanf("%f",&doacao);
        total+=doacao;
        x++;
    } while (x<=100 && total<7500);

    printf("Doacao arrecadada: %.2f",total);
    return 0;
}