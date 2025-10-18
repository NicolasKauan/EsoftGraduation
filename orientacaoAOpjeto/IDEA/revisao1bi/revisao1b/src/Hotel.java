import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto q){
        this.quartos.add(q);
    }

    public void hospedar(Hospede hospede, int numeroQuarto){
        for(Quarto q: quartos){
            if(q.getNumero() == numeroQuarto){
                q.ocupar(hospede);
                return;
            }
        }
        System.out.println("Quarto "+ numeroQuarto + " não encontrado.\n");
    }
    public void realizarCheckout(int numeroQuarto) {
        for (Quarto q : quartos) {
            if (q.getNumero() == numeroQuarto) {
                q.liberar();
                return;
            }
        }
        System.out.println("Quarto " + numeroQuarto + " não encontrado.");
    }



}
