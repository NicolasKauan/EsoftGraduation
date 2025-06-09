#include <stdio.h>
#include <stdlib.h>


int main() {
    int a, *b,**c,***d;
    b = &a;
    c = &b;
    d = &c;
    printf("Informe um valor: ");
    scanf("%d", &a);
    printf("O quadruplo do seu valor e %d",((***d)*4));



    return 0;
}