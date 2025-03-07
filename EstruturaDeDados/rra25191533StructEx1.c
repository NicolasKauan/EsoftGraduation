#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct veiculo {
    char marca[50], modelo[50], cor[50], placa[50];
    short int ano, ano_modelo, ano_fabricacao, combustivel;
};
int buscaSequencial(struct veiculo ve[], int tamanho, char chave[]);
void mostraVeiculo(struct veiculo ve[], int x);

int main() {
    struct veiculo ve[5];
    char bPlaca[50];
    int busca;

    for (int i = 0; i < 5; i++) {
        printf("\nCadastro de veiculos\n");
        printf("Informe marca %d: ", i + 1);
        scanf("%s", ve[i].marca);
        fflush(stdin);
        printf("Informe modelo %d: ", i + 1);
        scanf("%s", ve[i].modelo);
        fflush(stdin);
        printf("Informe cor %d: ", i + 1);
        scanf("%s", ve[i].cor);
        fflush(stdin);
        printf("Informe placa %d (padrão ABC-1234): ", i + 1);
        scanf("%s", ve[i].placa);
        fflush(stdin);
        printf("Informe ano %d: ", i + 1);
        scanf("%hd", &ve[i].ano);
        fflush(stdin);
        printf("Informe ano modelo %d: ", i + 1);
        scanf("%hd", &ve[i].ano_modelo);
        fflush(stdin);
        printf("Informe ano fabricacao %d: ", i + 1);
        scanf("%hd", &ve[i].ano_fabricacao);
        fflush(stdin);
        printf("Escolha o combustível %d:\n1-Gasolina\n2-Etanol\n3-Flex\n4-Diesel\n5-Elétrico\n6-Híbrido\n", i + 1);
        scanf("%hd", &ve[i].combustivel);
        fflush(stdin);
        while (ve[i].combustivel < 0 || ve->combustivel > 6){
        printf("Escolha o combustível %d:\n1-Gasolina\n2-Etanol\n3-Flex\n4-Diesel\n5-Elétrico\n6-Híbrido\n", i + 1);
        scanf("%hd", &ve[i].combustivel);
        }
        system("cls");
    }
    
    printf("Informe uma placa para buscar: ");
    scanf("%s", bPlaca);
    fflush(stdin);
    busca = buscaSequencial(ve, 5, bPlaca);

    if (busca == -1) {
        printf("Veículo não encontrado.\n");
    } else {
        mostraVeiculo(ve,busca);
    }
    
    system("pause");
    return 0;
}
void mostraVeiculo(struct veiculo ve[], int x){
    printf("\n--- Veículo Encontrado ---\n");
    printf("Marca: %s\n", ve[x].marca);
    printf("Modelo: %s\n", ve[x].modelo);
    printf("Cor: %s\n", ve[x].cor);
    printf("Ano: %hd\n", ve[x].ano);
    printf("Ano modelo: %hd\n", ve[x].ano_modelo);
    printf("Ano fabricação: %hd\n", ve[x].ano_fabricacao);
    
    printf("Combustível: ");
    switch (ve[x].combustivel) {
        case 1: 
            printf("Gasolina\n"); 
        break;
        case 2: 
            printf("Etanol\n"); 
        break;
        case 3: 
            printf("Flex\n"); 
        break;
        case 4: 
            printf("Diesel\n"); 
        break;
        case 5: 
            printf("Elétrico\n"); 
        break;
        case 6: 
            printf("Híbrido\n"); 
        break;
        default: 
            printf("Desconhecido\n"); 
        break;
    }

    printf("Placa: %s\n", ve[x].placa);
}

int buscaSequencial(struct veiculo ve[], int tamanho, char chave[]) {
    for (int i = 0; i < tamanho; i++) {
        if (strcmp(ve[i].placa, chave) == 0) {
            return i;
        }
    }
    return -1;
}
