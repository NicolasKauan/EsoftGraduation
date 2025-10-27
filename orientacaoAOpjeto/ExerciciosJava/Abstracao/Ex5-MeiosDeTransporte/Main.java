public class Main {
    public static void main(String[] args) {
        MeioTransporte carro = new Carro("Sedan", 0.08, 6.0);
        MeioTransporte bike = new Bicicleta("Bike Urbana");

        carro.mover(10);
        bike.mover(5);

        System.out.println("Custo carro por km: R$ " + carro.custoPorKm());
        System.out.println("Custo bike por km: R$ " + bike.custoPorKm());
    }
}
