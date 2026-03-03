package ExercicioFrete;

public class FreteMotoboy implements ITipoFrete{


    @Override
    public Double calcularFrete(Double pesoKg, Integer distanciaKm) {
        if(distanciaKm > 15){
            System.out.println("Entregas invalidas para distancias maiores que 15km! ");
            return -1.00;
        } else{
            return 8.00 + (2.00 * distanciaKm);
        }
    }
}
