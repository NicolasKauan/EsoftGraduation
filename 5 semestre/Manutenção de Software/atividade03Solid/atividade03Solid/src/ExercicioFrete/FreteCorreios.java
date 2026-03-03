package ExercicioFrete;

public class FreteCorreios implements ITipoFrete{
    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm) {
        if(pesoKg > 30){
            System.out.println("Entrega inválida para encomendas com mais de 30kg!");
            return -1.0;
        } else {
            return 12.00 + (1.50 * pesoKg) + (0.05 * distanciaKm);
        }
    }
}
