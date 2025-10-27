public class CelsiusParaFahrenheit implements Conversor<Double, Double> {
    @Override
    public Double converter(Double c) {
        return (c * 9.0/5.0) + 32.0;
    }
}
