#include <stdio.h>
#include <stdlib.h>

/*a) O valor da variável n1e memória da variável n1;
b) O endereço de memória da variável n1;
c) O valor da variável ptr;
d) O endereço de memória da variável ptr;
e) O valor ao qual a variável ptr está apontando;
f) O endereço de memória da qual a variável ptr está apontando
g) O tamanho em bytes da variável n1;
h) O tamanho em bytes da variável ptr;
i) O tamanho em bytes ao qual a variável ptr está apontando
*/


int main(){
    // Criação das variáveis
    int n1;
    int *ptr;
    ptr=&n1;
    char s[10] = "Moreno";
    char *ptr_char;

    // Solicitação do numero para o usuário
    printf("Informe um número: ");
    scanf("%d",&n1);

    // O valor da variável n1 e memória da variável n1
    printf("O valor da variável é %d, e sua memória é %d bytes.\n ",*ptr, sizeof(*ptr));

    // O endereço de memória da variável n1;
    printf("O valor do endereco de memória é %p.\n ",ptr);

    //O valor da variável pt
    printf("O valor da variável é %d\n",*ptr);

    // O endereço de memória da variável ptr;
    printf("O endereço de memória da variável ptr e: %p\n",&ptr);

    // O valor ao qual a variável ptr está apontando;
    printf("O valor ao qual a variável ptr está apontando e: %d\n",*ptr);

    // O endereço de memória da qual a variável ptr está apontando
    printf("O endereço de memória da qual a variável ptr está apontando: %p\n",&*ptr);

    // O tamanho em bytes da variável n1;
    printf("sua memória é %d bytes.\n", sizeof(n1));

    // O tamanho em bytes da variável ptr;
    printf("sua memória é %d bytes.\n",sizeof(ptr));

    // O tamanho em bytes ao qual a variável ptr está apontando
    printf("Sua memória é %d bytes.\n",sizeof(*ptr));

    // Teste do exercicio 20
    printf("%p \n",&s[2]);

    return 0;
}