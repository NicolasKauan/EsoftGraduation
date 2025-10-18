public class main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(2.0);
        double area1 = circulo1.calcularArea();
        double perimetro1 = circulo1.calcularPerimetro();

        System.out.printf("Area do circulo: %f", area1);
        System.out.printf("\nPerimetro do circulo: %f", perimetro1);
    }
}
