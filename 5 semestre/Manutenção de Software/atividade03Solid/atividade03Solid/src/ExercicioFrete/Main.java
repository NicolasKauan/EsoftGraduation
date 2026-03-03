package ExercicioFrete;

public class Main {
    public static void main(String[] args){
        ITipoFrete frete = new FreteCorreios();
        ITipoFrete frete1 = new FreteMotoboy();
        ITipoFrete frete2 = new FreteTransportadora();

        System.out.println("Frete correios:"+CalculadoraFrete.calculaFrete(40.0,10, frete));
        System.out.println("Frete motoboy:"+CalculadoraFrete.calculaFrete(10.0,10, frete1));
        System.out.println("Frete transportadora:"+CalculadoraFrete.calculaFrete(10.0,10, frete2));
    }
}
