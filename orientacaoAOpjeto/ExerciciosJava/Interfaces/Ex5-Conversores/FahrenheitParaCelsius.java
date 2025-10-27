public class FahrenheitParaCelsius implements Conversor<Double, Double> {
    @Override
    public Double converter(Double f) {
        return (f - 32.0) * 5.0/9.0;
    }
}
