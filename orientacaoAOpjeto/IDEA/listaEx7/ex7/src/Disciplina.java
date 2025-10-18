public class Disciplina {
    private String nome;
    private Professor professor; // pode ser null (sem professor alocado)

    public Disciplina(String nome) {
        this.nome = nome;
        this.professor = null;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        if (professor != null) {
            return "Disciplina: " + nome + " | Professor: " + professor.getNome();
        } else {
            return "Disciplina: " + nome + " | Sem professor alocado";
        }
    }
}
