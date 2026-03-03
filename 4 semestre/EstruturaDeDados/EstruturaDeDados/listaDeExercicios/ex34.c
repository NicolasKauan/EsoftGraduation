#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// Professor eu esqueci de comentar as anteriores e já está tarde vou tentar comentar tudo daqui em diante kkk
//referenciando a funcao copia no comeco 
void copia(char x[], char y[]);

int main() {
    // Declaração das variáveis
    char str1[] = "Nicolas";
    char str2[20];

    // Mostrar para o usuário as 2 strings
    printf("String 1: %s\n",str1);
    copia(str1,str2);//chamada do procedimento copia e passando as variáveis
    printf("String 2(conteudo copiado da 1): %s ",str2);




    return 0;
}

// Função copia onde iremos copiar uma string de uma variavel para outra variável
void copia(char x[], char y[]){
    // declaracao da variavel inteira i para ser usada no contador
    int i = 0;
    // Copia cada caractere até chegar no nulo
    while (x[i] != '\0'){
        y[i] = x[i];
        i++;
    }
    // adiciona o caractere nulo no final da string de destino
    y[i] = '\0';
}