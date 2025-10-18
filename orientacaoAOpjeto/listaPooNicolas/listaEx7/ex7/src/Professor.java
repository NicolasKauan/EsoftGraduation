import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    // Associa disciplina ao professor
    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            disciplina.setProfessor(this); // garante relação dos dois lados
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor: ").append(nome).append("\nDisciplinas: ");
        if (disciplinas.isEmpty()) {
            sb.append("Nenhuma");
        } else {
            for (Disciplina d : disciplinas) {
                sb.append("\n - ").append(d.getNome());
            }
        }
        return sb.toString();
    }
}
