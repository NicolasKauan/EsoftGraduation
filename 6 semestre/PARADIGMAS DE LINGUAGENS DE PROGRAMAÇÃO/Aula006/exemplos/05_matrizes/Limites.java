// Aula 06 - Matrizes e verificação de índices (Sebesta 6.5.2-6.5.3, p. 249-251)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Limites.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] v = {10, 20, 30};   // matriz dinâmica do monte fixa (p. 251)
        try {
            for (int i = 0; i <= v.length; i++)
                System.out.println("v[" + i + "] = " + v[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção: " + e.getMessage());
        }

        // ArrayList: matriz dinâmica do monte (cresce e encolhe)
        List<Integer> lista = new ArrayList<>(List.of(10, 20, 30));
        lista.add(40);
        System.out.println(lista + " tamanho=" + lista.size());
    }
}
