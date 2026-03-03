package exercicios/interfaces/ex2;
public class Main {
    public static void main(String[] args) {
        DispositivoEletronico lamp = new Lampada();
        DispositivoEletronico ar = new ArCondicionado();
        lamp.ligar(); lamp.desligar();
        ar.ligar(); ar.desligar();
    }
}
