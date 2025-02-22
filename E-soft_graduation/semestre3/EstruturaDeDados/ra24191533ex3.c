#include <stdio.h>




int main(){
    short int i,x;
    printf("Informe um valor entre 5 e 20: ");
    scanf("%hd",&x);
    if(x>=5 && x<=20){
        for ( i = 0; i <= x; i++){
            printf("%d %d\n",i,x-i);
        }
        
    }else{
        printf("Numero informado menor que 5 ou maior que 20 ");
    }


    return 0;
}