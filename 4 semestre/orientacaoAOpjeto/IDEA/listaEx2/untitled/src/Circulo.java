public class Circulo {

    /*Desenvolva uma classe Circulo que é definida por um atributo raio. A classe deve ter um construtor que obriga
    a definição do raio no momento da criação. Crie dois métodos: calcularArea, que retorna a área do círculo (π *
    raio²), e calcularPerimetro, que retorna o perímetro (2 * π * raio). Utilize a constante Math.PI para o valor de π.*/

    private double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    double calcularArea(){
        return (this.raio*this.raio);
    }
    double calcularPerimetro() {
        return 2*Math.PI*raio*raio;
    }
}
