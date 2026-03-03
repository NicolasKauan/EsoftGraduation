package exercicios/abstracao/ex3;
public class Retangulo extends Forma {
    private final double largura; private final double altura;
    public Retangulo(double largura, double altura) { this.largura = largura; this.altura = altura; }
    @Override public double area() { return largura * altura; }
    @Override public double perimetro() { return 2 * (largura + altura); }
}
