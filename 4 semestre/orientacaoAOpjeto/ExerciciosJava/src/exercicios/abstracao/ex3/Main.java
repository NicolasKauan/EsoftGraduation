package exercicios/abstracao/ex3;
public class Main {
    public static void main(String[] args) {
        Forma c = new Circulo(3.0);
        Forma r = new Retangulo(4.0, 2.0);
        System.out.println("Círculo área=" + c.area() + " perímetro=" + c.perimetro());
        System.out.println("Retângulo área=" + r.area() + " perímetro=" + r.perimetro());
    }
}
