// Aula 06 - Uniões discriminadas no Java moderno (Sebesta 6.10, p. 270-273)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Uniao.java      (Java 21+)
// sealed + record + switch com padrões = união discriminada verificada pelo compilador
public class Main {
    sealed interface Forma permits Circulo, Retangulo {}
    record Circulo(double raio) implements Forma {}
    record Retangulo(double largura, double altura) implements Forma {}

    static double area(Forma f) {
        return switch (f) {           // exaustivo: não precisa de default
            case Circulo c -> Math.PI * c.raio() * c.raio();
            case Retangulo r -> r.largura() * r.altura();
        };
    }

    public static void main(String[] args) {
        Forma[] formas = { new Circulo(1), new Retangulo(2, 3) };
        for (Forma f : formas)
            System.out.printf("%s -> %.2f%n", f, area(f));
    }
}
