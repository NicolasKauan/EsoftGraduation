import java.util.ArrayList;
import java.util.List;

public class TurmaRefatorada {
    private List<Aluno> alunos;

    public TurmaRefatorada() {
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            System.out.println("Alunos matriculados:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public int getNumeroDeAlunos() {
        return alunos.size();
    }

    public Aluno getAlunoNaPosicao(int indice) {
        if (indice >= 0 && indice < alunos.size()) {
            return alunos.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNome() + " removido da turma.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    public Aluno buscarAlunoPorRa(int ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == ra) {
                return aluno;
            }
        }
        return null;
    }
}
