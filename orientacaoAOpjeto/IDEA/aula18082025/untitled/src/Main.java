public class Main {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro("bob",0,"João");


        Pessoa pedro = new Pessoa(150, "Pedro Silva");

        Banho primeiroBanho = new Banho("protex", 30,bob, pedro);

        bob.printValores();
        Pessoa lucas = new Pessoa(151,"Lucas Souza");
    }
}
