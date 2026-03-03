#include <stdio.h>
#include <stdlib.h>

int main() {
    struct pessoa {
        char nome[50];
        char numero[12];
        char email[50];
        char cpf[12];
    };

    struct pessoa p[3];

    for(int i = 0; i<3; i++){  // Correção: "i>3" estava errado, deveria ser "i<3"
        printf("Informe o nome da %d pessoa: ",i+1);
        scanf(" %[^\n]",p[i].nome);
        printf("Informe o numero da %d pessoa: ",i+1);
        scanf(" %[^\n]",p[i].numero);
        printf("Informe o email da %d pessoa: ",i+1);
        scanf(" %[^\n]",p[i].email);
        printf("Informe o CPF da %d pessoa: ",i+1);
        scanf(" %[^\n]",p[i].cpf);
    }

    int x = 0, y = 0, z = 0;
    int *prt_x, *prt_y, *prt_z;
    prt_x = &x;
    prt_y = &y;
    prt_z = &z;

    char w = ' ';  
    char *ptr_w;
    ptr_w = &w;

    float k;
    float *ptr_k;
    ptr_k = &k;

    double n;
    double *ptr_n;
    ptr_n = &n;

    x = 10;
    y = (2 * x);
    *prt_z = (10 * *prt_y) - 20;
    *ptr_w = p[1].nome[2];  
    *ptr_k = *prt_z / 2;
    *ptr_n = 0.325 * (*prt_x + *prt_y);

    // Exibir resultados
    printf("VARIÁVEIS:\n");
    printf("x = %d, endereço: %p\n", x, (void*)&x);
    printf("y = %d, endereço: %p\n", y, (void*)&y);
    printf("z = %d, endereço: %p\n", z, (void*)&z);
    printf("w = %c, endereço: %p\n", w, (void*)&w);
    printf("k = %.2f, endereço: %p\n", k, (void*)&k);
    printf("n = %.2lf, endereço: %p\n", n, (void*)&n);

    printf("\nPONTEIROS:\n");
    printf("prt_x = %p, endereço: %p, aponta para: %p\n", (void*)prt_x, (void*)&prt_x, (void*)&x);
    printf("prt_y = %p, endereço: %p, aponta para: %p\n", (void*)prt_y, (void*)&prt_y, (void*)&y);
    printf("prt_z = %p, endereço: %p, aponta para: %p\n", (void*)prt_z, (void*)&prt_z, (void*)&z);
    printf("ptr_w = %p, endereço: %p, aponta para: %p\n", (void*)ptr_w, (void*)&ptr_w, (void*)&w);
    printf("ptr_k = %p, endereço: %p, aponta para: %p\n", (void*)ptr_k, (void*)&ptr_k, (void*)&k);
    printf("ptr_n = %p, endereço: %p, aponta para: %p\n", (void*)ptr_n, (void*)&ptr_n, (void*)&n);

    printf("\nCONSUMO EM BYTES:\n");
    printf("sizeof(int) = %lu bytes\n", sizeof(int));
    printf("sizeof(char) = %lu bytes\n", sizeof(char));
    printf("sizeof(float) = %lu bytes\n", sizeof(float));
    printf("sizeof(double) = %lu bytes\n", sizeof(double));
    printf("sizeof(struct pessoa) = %lu bytes\n", sizeof(struct pessoa));

    system("pause");
    return 0;
}

//2) seria 1 byte porque mesmo sem nada ela ocupa o minimo para ser refeciada
//3)int posicao = strlen(str) - 1;
//4) sera 4 posições a mais por exemplo: 1º caractere: 000090FEF0 2º caractere: 000090FEF4
