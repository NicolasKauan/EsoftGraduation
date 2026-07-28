	#include <stdio.h>
#include <stdlib.h>

typedef struct tp_produto{
	int codigo;
	char nome[100];
	struct tp_produto *prox;
}tp_produto;

tp_produto *primeiroLista;

void addLast(){
	tp_produto *produto = (tp_produto*) malloc(sizeof(tp_produto));
	printf("\nDigite o codigo: ");
	scanf("%i", &produto->codigo);
	printf("\nDigite o nome: ");
	fflush(stdin);
	fgets(produto->nome, 100, stdin);
	produto->prox = NULL;	
	if(primeiroLista==NULL){
		primeiroLista = produto;
	}else{
		tp_produto *aux = primeiroLista;
		while(aux->prox!=NULL){
			aux = aux->prox;
		}
		aux->prox = produto;
	}	
	system("CLS");
	
}

void imprime(tp_produto *aux){	
	if(aux != NULL){
		printf("\n===== Dados do produto =====");
		printf("\nCodigo: %i", aux->codigo);
		printf("\nNome: %s", aux->nome);
		if(aux->prox==NULL){
			printf("Prox nulo");
		}else{
			printf("Prox: %i", aux->prox->codigo);
		}	
		printf("\nPrimeiro da lista: %i", primeiroLista->codigo);		
		printf("\n==========");		
		imprime(aux->prox);
	}
	
}

main() {
    addLast();
    imprime(primeiroLista);
    system("pause");
	system("CLS");		
    addLast();
    imprime(primeiroLista);
    system("pause");
	system("CLS");		
    addLast();
    imprime(primeiroLista);
    system("pause");
	system("CLS");		
}
				

	