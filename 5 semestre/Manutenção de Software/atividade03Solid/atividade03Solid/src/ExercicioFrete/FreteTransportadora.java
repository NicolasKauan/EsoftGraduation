package ExercicioFrete;

public class FreteTransportadora implements ITipoFrete{


    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm) {
        Double frete = 20.00 + (1.00 * pesoKg) + (0.03 * distanciaKm);
        if(pesoKg < 10.00){
            return frete * 0.9;
        } else{
            return frete;
        }
    }
}
