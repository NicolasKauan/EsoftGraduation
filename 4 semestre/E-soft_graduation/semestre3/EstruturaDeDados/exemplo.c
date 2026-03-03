#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <float.h>

int main(){
    float doacao, total=0;
    int x;
    for(x=1; x<=100 && total<7500; x++){
        printf("Pessoa %d. Valor doado: ",x);
        scanf("%f", &doacao);
        total+=doacao;
    }
    printf("Valor medio: %.2f \n\n",total/(x-1));


    return 0;
}