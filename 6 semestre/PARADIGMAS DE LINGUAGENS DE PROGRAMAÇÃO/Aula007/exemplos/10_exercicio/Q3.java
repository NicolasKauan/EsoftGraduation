// Exercício Aula 07 - Questão 3: qual é a saída? Onde está o bug?
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
public class Main {
    public static void main(String[] args) {
        int dia = 2;
        String nome = "";
        switch (dia) {
            case 1: nome = "domingo";
            case 2: nome = "segunda";
            case 3: nome = "terça";
            default: nome = "inválido";
        }
        System.out.println(nome);
    }
}
