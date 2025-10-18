public class Turma {
    private Aluno[] alunos;
    private int proximaPosicaoLivre;

    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.proximaPosicaoLivre = 0;
    }

    public void matricularAluno(Aluno aluno) {
        if (proximaPosicaoLivre < alunos.length) {
            alunos[proximaPosicaoLivre] = aluno;
            proximaPosicaoLivre++;
            System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
        } else {
            System.out.println("Turma lotada! Não é possível matricular " + aluno.getNome());
        }
    }

    public void listarAlunos() {
        if (proximaPosicaoLivre == 0) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            System.out.println("Alunos matriculados:");
            for (int i = 0; i < proximaPosicaoLivre; i++) {
                System.out.println(alunos[i]);
            }
        }
    }
}
