// Aula 09 - Classes abstratas e vinculação dinâmica (Sebesta 12.2.3, p. 492-493)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
// Local:  java Polimorfismo.java
import java.util.List;

abstract class Forma {                         // classe abstrata: não pode ser instanciada (p. 493)
    abstract double area();                    // método abstrato: só o protocolo
    String descrever() {
        return getClass().getSimpleName() + " com área " + String.format("%.2f", area());
    }
}

class Circulo extends Forma {
    double r;
    Circulo(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
}

class Retangulo extends Forma {
    double l, a;
    Retangulo(double l, double a) { this.l = l; this.a = a; }
    double area() { return l * a; }
}

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = List.of(new Circulo(1), new Retangulo(2, 3));
        for (Forma f : formas)                 // f é uma referência POLIMÓRFICA
            System.out.println(f.descrever()); // qual area()? decidido em EXECUÇÃO
        // new Forma();                        // ERRO de compilação: Forma é abstrata
    }
}
