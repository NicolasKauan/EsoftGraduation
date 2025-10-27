public class Main {
    public static void main(String[] args) {
        PortaDeSeguranca porta = new PortaDeSeguranca("1234");
        porta.ligar();
        porta.autenticar("9999"); // falha
        porta.autenticar("1234"); // ok, abre
        System.out.println("Aberta? " + porta.isAberta());
        porta.fechar();
        System.out.println("Aberta? " + porta.isAberta());
        porta.desligar();
    }
}
