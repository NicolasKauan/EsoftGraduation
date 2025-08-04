import java.util.Scanner;

public class CadastroProcedural {
    public static void main(String[] args) {
        System.out.printf("Ola mundo %d",69);

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite um nome: ");
        leitor.next();
        String nome = leitor.next();
        System.out.printf("Nome Digitado: %s", nome);

        
    }
}