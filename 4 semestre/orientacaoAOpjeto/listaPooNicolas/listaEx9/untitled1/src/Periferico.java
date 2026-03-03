public class Periferico {
    private String tipo;

    public Periferico(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Periférico: " + tipo;
    }
}
