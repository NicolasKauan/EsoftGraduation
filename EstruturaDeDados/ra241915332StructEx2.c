//Primeiro, otimize as estruturas abaixo para que consumam o menor número de 
//bytes possível, verificando se há algum campo importante que ficou de fora, mas
//sem excluir os campos já definidos.
//Posteriormente, construir um programa com base na estrutura que cadastre 5 pessoas,
//classifique as pessoas em ordem de nome e posteriormente apresente ao usuário
//o nome, cpf, fone, cidade e estado.
//Por fim, apresente quantos bytes cada estrutura consome.


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Definição da struct Endereco
typedef struct {
    char logradouro[50];
    short int numero;
    char cidade[30];
    char estado[3]; 
    char cep[10]; 
} ENDERECO;

// Definição da struct Pessoa, que inclui um Endereco
typedef struct {
    char nome[50];
    char cpf[12];
    char rg[10]; 
    char fone[15];  
    char sexo; 
    short int idade;
    ENDERECO endereco; 
} PESSOA;

PESSOA cliente[5];

void ordenaPessoa(PESSOA cliente[], int n);
void cadastroPessoa();


int main() {
    int bytesEndereco = sizeof(ENDERECO);
    int bytesPessoa = sizeof(PESSOA);

    // Ordenação das pessoas por nome
    ordenaPessoa(cliente, 5);

    // Exibição dos dados ordenados
    printf("\nLista de pessoas ordenadas por nome:\n");
    for (int i = 0; i < 5; i++) {
        printf("\nNome: %s\nCPF: %s\nTelefone: %s\nCidade: %s\nEstado: %s\n", 
            cliente[i].nome, cliente[i].cpf, cliente[i].fone, cliente[i].endereco.cidade, cliente[i].endereco.estado);
    }
    
    printf("\nTamanho da struct Endereco: %d bytes (%d bits)\n", bytesEndereco, bytesEndereco * 8);
    printf("Tamanho da struct Pessoa: %d bytes (%d bits)\n", bytesPessoa, bytesPessoa * 8);

    return 0;
}

void cadastroPessoa(){
    for (int i = 0; i < 5; i++) {
        printf("\nCadastro da pessoa %d:\n", i + 1);
        
        printf("Nome: ");
        scanf(" %[^\n]", cliente[i].nome);

        printf("CPF: ");
        scanf(" %[^\n]", cliente[i].cpf);
        
        printf("RG: ");
        scanf(" %[^\n]", cliente[i].rg);

        printf("Telefone: ");
        scanf(" %[^\n]", cliente[i].fone);

        printf("Sexo (M/F): ");
        scanf(" %c", &cliente[i].sexo);  
        
        printf("Idade: ");
        scanf("%hd", &cliente[i].idade);
        while (getchar() != '\n'); 

        printf("Logradouro: ");
        scanf(" %[^\n]", cliente[i].endereco.logradouro);
        
        printf("Número: ");
        scanf("%hd", &cliente[i].endereco.numero);
        while (getchar() != '\n');  
        
        printf("Cidade: ");
        scanf(" %[^\n]", cliente[i].endereco.cidade);
        
        printf("Estado (Sigla): ");
        scanf("%2s", cliente[i].endereco.estado); 
        
        printf("CEP: ");
        scanf(" %[^\n]", cliente[i].endereco.cep);
    }
}
void lerArquivo() {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Erro ao abrir o arquivo %s\n", filename);
        exit(1);
    }

    for (int i = 0; i < 5; i++) {
        fscanf(file, " %49[^;];%11[^;];%14[^;];%c;%hd;%49[^;];%hd;%29[^;];%2[^;];%9[^\n]\n",
            cliente[i].nome, cliente[i].cpf, cliente[i].fone, &cliente[i].sexo, &cliente[i].idade,
            cliente[i].endereco.logradouro, &cliente[i].endereco.numero, cliente[i].endereco.cidade, 
            cliente[i].endereco.estado, cliente[i].endereco.cep);
    }

    fclose(file);
}

// Função para ordenar as pessoas por nome
void ordenaPessoa(PESSOA cliente[], int n) {
    PESSOA temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (strcmp(cliente[j].nome, cliente[j + 1].nome) > 0) {
                temp = cliente[j];
                cliente[j] = cliente[j + 1];
                cliente[j + 1] = temp;
            }
        }
    }
}
