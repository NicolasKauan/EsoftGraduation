#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int idade;
    char nome[50];
} ex27;


int main() {
    ex27 *ptr;
    ex27 pessoa;
    ptr = &pessoa;

    return 0;
}