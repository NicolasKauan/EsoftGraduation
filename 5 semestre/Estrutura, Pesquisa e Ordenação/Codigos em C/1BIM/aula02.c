
/*
#include <stdio.h>
#include <conio.h>
#include <windows.h>
#include <locale.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct {
    int codigo;
    char nome[100];
    float valor;
} tp_produto;

int op;
int prox = 0;
bool sair = false; 

tp_produto produtos[100];

void cadastrar(){
    system("cls");
    if(prox >= 100){
        printf("Cadastro cheio...");
        system("pause");
    }else{
        printf("\nDigite o codigo: ");
        scanf("%i", &produtos[prox].codigo);
        
        printf("\nDigite o nome: ");
        fflush(stdin);
        fgets(produtos[prox].nome, 100, stdin);
        
        produtos[prox].nome[strcspn(produtos[prox].nome, "\n")] = 0;
        
        printf("\nDigite o valor: ");
        scanf("%f", &produtos[prox].valor);
        prox++;     
    }
}

void remover(){
    system("CLS");
    int codigo;
    printf("Digite o codigo a ser removido: \n");
    scanf("%i", &codigo);
    bool localizado = false; 
    
    for(int i=0; i<prox; i++){
        if(codigo == produtos[i].codigo){
            produtos[i] = produtos[prox-1];
            prox--;
            localizado = true;
			printf("\nProduto removido com sucesso!\n");
        }
    }
    if(!localizado){
        printf("\nProduto nao localizado!\n");
    }
    system("pause");
}

void listar(){
    system("CLS");
    for(int i=0; i<prox; i++){
        printf("========Dados de produto=========");
        printf("\nCodigo: %i", produtos[i].codigo);
        printf("\nNome: %s", produtos[i].nome);
        printf("\nValor: %.2f", produtos[i].valor);
        printf("\n===============================");
        printf("\n");
    }
    system("pause");
}

void buscar(){
    system("CLS");
    int codigo;
    printf("Digite o codigo a ser localizado: \n");
    scanf("%i", &codigo);
    bool localizado = false; 
    
    for(int i=0; i<prox; i++){
        if(codigo == produtos[i].codigo){
            printf("========Dados de produto=========");
            printf("\nCodigo: %i", produtos[i].codigo);
            printf("\nNome: %s", produtos[i].nome);
            printf("\nValor: %.2f", produtos[i].valor);
            printf("\n===============================");
            printf("\n");
            localizado = true; 
        }
    }
    if(!localizado){
        printf("\nProduto nao localizado!\n");
    }
    system("pause");
}

void menu(){
    system("CLS");
    printf("\n=== MENU ===\n");
    printf("01- Cadastrar\n");
    printf("02- Listar\n");
    printf("03- Remover\n");
    printf("04- Consultar\n");
    printf("05- Sair do Sistema\n");
    printf("Digite uma opcao: ");
}

void sairDoSistema(){
    printf("Saindo do sistema...\n");
    sair = true;
}

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    while(sair == false){
        menu();
        scanf("%d", &op);
        
        switch(op){
            case 1:
                cadastrar();
                break;
            case 2:
                listar(); 
				break;
            case 3:
                remover();
                break;
            case 4:
                buscar();
                break;
            case 5:
                sairDoSistema();
                break;
            default:
                printf("Opcao invalida!\n");
                system("pause");
                break;
        }
    }
    return 0;
} */
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <windows.h> 
#include <locale.h>
#include <stdbool.h>

    
int op;
int prox = 0;
boolean sair = false;

typedef struct{
    int codigo;
    char nome[100];
    float valor;
} tp_produto;

tp_produto produtos[100];

void cadastrar(){
	system ("CLS");
	if(prox >= 100){
		printf("Cadastro cheio...\n");
		system("pause");
	}else{		
		printf("\nDigite o codigo: ");
	    scanf("%i", &produtos[prox].codigo);	
	    printf("\nDigite o nome: ");
	    fflush(stdin);
    	fgets(produtos[prox].nome, 100,stdin);	
	    printf("\nDigite o valor: ");
	    scanf("%f", &produtos[prox].valor);	
	    prox++;			
	}	
}

void consultar(){
	system ("CLS");
	int codigo;
	printf("Digite o codigo a ser localizado: \n");
	scanf("%i", &codigo);
	boolean localizado = false;
	
	for(int i=0; i < prox; i++){
		if(codigo == produtos[i].codigo){
			printf("\n====== Dados de produto =======");
		    printf("\nCodigo: %i", produtos[i].codigo);
	        printf("\nNome: %s", produtos[i].nome);
	        printf("Valor: %f", produtos[i].valor);
	        printf("\n===============================");
	        printf("\n");
	        localizado = true;
		}		
	}
	if(!localizado){
		printf("\nProduto nao localizado!\n");
	}
	system("pause");
}

void listar(){
	system ("CLS");
	for(int i=0; i < prox; i++){
		printf("\n====== Dados de produto =======");
		printf("\nCodigo: %i", produtos[i].codigo);
	    printf("\nNome: %s", produtos[i].nome);
	    printf("Valor: %f", produtos[i].valor);
	    printf("\n===============================");
	    printf("\n");
	}
	system("pause");	
}

void remover(){
	system ("CLS");
	int codigo;
	printf("Digite o codigo a ser removido: \n");
	scanf("%d", &codigo);
	boolean localizado = false;
	
	for(int i=0; i < prox; i++){
		if(codigo == produtos[i].codigo){			
			produtos[i].codigo = produtos[prox-1].codigo;			
			strcpy(produtos[i].nome, produtos[prox-1].nome);
			produtos[i].valor  = produtos[prox-1].valor;
			prox--;			
	        localizado = true;
		}		
	}
	if(!localizado){
		printf("\nProduto nao localizado!\n");
	}
	system("pause");
}

void menu(){
    system("CLS");
    printf("\n=== MENU ===\n");
    printf("01- Cadastrar\n");
    printf("02- Listar\n");
    printf("03- Remover\n");
    printf("04- Consultar\n");
    printf("05- Sair do Sistema\n");
    printf("Digite uma opcao: ");
}

void sairDoSistema(){
    printf("Saindo do sistema...\n");
    sair = true;
}

main()
{	
    setlocale(LC_ALL, "Portuguese");
	while(sair == false){
		system ("CLS");
		menu();
		scanf("%i", &op);
		switch(op){
			case 1:
				cadastrar();
				break;
			case 2:
				consultar();
				break;
			case 3:
				listar();                                           
				break;
			case 4:
				remover();
				break;
			case 5:
				sairDoSistema();
				break;				
		}
	}
	
}