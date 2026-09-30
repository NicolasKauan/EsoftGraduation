// Aula 07 - Saídas posicionadas pelo usuário: break rotulado (Sebesta 8.3.3, p. 347-349)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Rotulos.java
public class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, -5, 6}, {7, 8, 9}};
        externo:                                   // rótulo
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    System.out.println("negativo em (" + i + "," + j + ")");
                    break externo;                 // sai dos DOIS laços
                }
            }
        }

        int k = 0;
        do {                                       // pós-teste: executa ao menos uma vez (p. 347)
            System.out.println("k = " + k);
            k++;
        } while (k < 0);
    }
}
