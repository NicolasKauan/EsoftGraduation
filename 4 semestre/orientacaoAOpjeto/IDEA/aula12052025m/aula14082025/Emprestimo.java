public class Emprestimo {
    int idEmprestimo;
    String dataEmprestimo;
    String dataDevolucao;
    Leitor leitor2;

    Emprestimo(int idEmprestimo, String dataEmprestimo, String dataDevolucao, String nome, int idLeitor) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        leitor2 = new Leitor(nome, idLeitor);
    }
}
