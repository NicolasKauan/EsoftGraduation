public class Main {
    public static void main(String[] args) {
        Conversor<Double, Double> c2f = new CelsiusParaFahrenheit();
        Conversor<Double, Double> f2c = new FahrenheitParaCelsius();

        System.out.println("25 C -> F = " + c2f.converter(25.0));
        System.out.println("77 F -> C = " + f2c.converter(77.0));
    }
}
