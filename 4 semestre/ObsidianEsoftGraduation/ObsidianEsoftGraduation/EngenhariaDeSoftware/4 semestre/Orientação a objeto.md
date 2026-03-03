[[Engenharia de requisitos]]
[[Banco de dados]]
[[Canvas_OrientaçãoAOjbeto.canvas|Canvas_OrientaçãoAOjbeto]]

### AULA 31/07/2025
 
 Classe: molde
PALAVRAS RESERVADAS:

### AULA 07/08/2025

Exercicio 23:

	/*Exercicio 23*/  
import java.util.Scanner;  
  
public class Exercicio23 {  
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in);  
  
        int total = 0;  
        for (int i=0; i<10; i++){  
            System.out.printf("Digite o %d  numero: \n", i+1);  
            int numeroDigitado = leitor.nextInt();  
            total += numeroDigitado;  
        }  
  
        System.out.printf("Total: %d", total);  
    }  
}

Exercicio 28:

	/*Exercicio da lista 28*/  
import java.util.Scanner;  
  
public class Exercicio28 {  
    public static void main(String[] args) {  
  
        Scanner leitor = new Scanner(System.in);  
        boolean isCorreto = true;  
        do {  
  
            System.out.printf("Digite uma senha: ");  
            String senhaDigitada = leitor.next();  
  
            int tamanhoSenha = senhaDigitada.length();  
  
            if (tamanhoSenha >=8) {  
                System.out.printf("Senha correta");  
                isCorreto = false;  
            } else {  
                System.out.printf("Senha incorreta!\n");  
            }  
        }while (isCorreto);  
    }  
}

 
 