#include <stdio.h>

int main(){
    short int i,j,x;
    printf("Informe um valor entre 10 e 50: ");
    scanf("%hd",&x);
    if(x>=10 && x<=50){
        for ( i = 0; i <= x; i++){
            printf("%hd\n",i);
        }
        for ( j = 0; j <= (2*x); j+=5){
            printf("%hd\n",j);
        }
        printf("tamanho em bytes(i): %hd\nTamanho em bytes(j): %hd\nTamanho em bytes(x): %hd",sizeof(i),sizeof(j),sizeof(x));
    }else{
        printf("Numero informado menor que 5 ou maior que 20 ");
    }


    return 0;
}