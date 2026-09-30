// Aula 06 - Tipos enumeração (Sebesta 6.4.2, p. 246)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Enumeracao.java
// Em Java, enum é uma CLASSE: pode ter atributos, construtor e métodos.
public class Main {
    enum Cor { VERMELHO, VERDE, AZUL }

    enum Moeda {
        REAL("R$", 1.0), DOLAR("US$", 5.40), EURO("EUR", 5.90); // cotações ilustrativas

        private final String simbolo;
        private final double cotacao;

        Moeda(String simbolo, double cotacao) {
            this.simbolo = simbolo;
            this.cotacao = cotacao;
        }

        String converter(double valorEmReais) {
            return String.format("%s %.2f", simbolo, valorEmReais / cotacao);
        }
    }

    public static void main(String[] args) {
        Cor c = Cor.VERDE;
        System.out.println(c + " ordinal=" + c.ordinal());  // VERDE ordinal=1
        // c = 1;           // ERRO de compilação: int não é Cor
        // int x = c + 1;   // ERRO de compilação: Cor não é int

        for (Cor x : Cor.values()) System.out.print(x + " ");
        System.out.println();
        System.out.println(Cor.valueOf("AZUL"));

        for (Moeda m : Moeda.values()) System.out.println(m.converter(100));
    }
}
