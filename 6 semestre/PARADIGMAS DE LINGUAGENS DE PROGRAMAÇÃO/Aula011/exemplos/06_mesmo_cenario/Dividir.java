// Aula 11 - Mesmo cenário: converter um texto e dividir 100 por ele (Java: exceções)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Dividir.java
public class Main {
    static int dividirCem(String texto) {
        int n = Integer.parseInt(texto);   // pode lançar NumberFormatException
        return 100 / n;                    // pode lançar ArithmeticException
    }

    public static void main(String[] args) {
        for (String entrada : new String[] {"4", "0", "abc"}) {
            try {
                System.out.println(entrada + " -> " + dividirCem(entrada));
            } catch (NumberFormatException e) {
                System.out.println(entrada + " -> não é um número (" + e.getMessage() + ")");
            } catch (ArithmeticException e) {
                System.out.println(entrada + " -> " + e.getMessage());
            }
        }
    }
}
