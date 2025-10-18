import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;

    private String cpf;

    private List telefone;

    private int ultimaPossicaoDisponivel;

    public Pessoa(String nome, String cpf, int qtdTelefone) {
     this.nome = nome;
     this.cpf = cpf;
     this.telefone = new ArrayList(  );
     this.ultimaPossicaoDisponivel = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String[] getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addTelefone(String telefone) {
        this.telefone[ultimaPossicaoDisponivel] = telefone;
        this.ultimaPossicaoDisponivel++;
    }

    public void visuTelefone(){
        for(int i = 0; i < this.ultimaPossicaoDisponivel; i++){
            System.out.printf("Telefone: %s\n", telefone[i]);
        }
    }

    public void removerTelefone(String telefone1) {
        for (int i = 0; i < this.ultimaPossicaoDisponivel; i++) {
            if ( this.telefone != null && this.telefone[i] == (telefone1)) {
                this.telefone[i] = null;
                this.ultimaPossicaoDisponivel--;
            }
        }
    }
    public void editarTelefone(){
        for(int i = 0; i < this.ultimaPossicaoDisponivel; i++){
            if(this.telefone[i].equals(telefone[i])){
                this.telefone[i] = null;
            }
        }
    }
}
