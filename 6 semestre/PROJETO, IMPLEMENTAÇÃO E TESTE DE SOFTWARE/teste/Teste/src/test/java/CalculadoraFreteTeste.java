import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraFreteTeste {
    CalculadoraFrete calculadora;
    @BeforeEach
    void preparar() {
        calculadora = new CalculadoraFrete();
    }

    @Test
    public  void deveCobrarFrete(){
        Assertions.assertEquals(20.0, calculadora.calcular(0,false));
    }

    @Test
    public void naoDeveCobrar(){
        Assertions.assertEquals(0.0, calculadora.calcular(200.0,false));
    }
}
