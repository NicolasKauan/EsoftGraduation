public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador(8, 16);
        MemoriaRam memoria = new MemoriaRam("Corsair", 16);

        Computador pc = new Computador(650, processador, memoria);

        Periferico teclado = new Periferico("Teclado");
        Periferico mouse = new Periferico("Mouse");
        Periferico monitor = new Periferico("Monitor");

        pc.adicionarPeriferico(teclado);
        pc.adicionarPeriferico(mouse);
        pc.adicionarPeriferico(monitor);

        pc.mostrarConfiguracao();
    }
}
