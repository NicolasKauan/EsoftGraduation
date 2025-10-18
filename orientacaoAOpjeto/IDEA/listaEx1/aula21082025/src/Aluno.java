public class Aluno {

    String nome;

    Double nota1;

    Double nota2;

    Aluno(String nome, Double nota1, Double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void exibirDados(){
        System.out.printf("Nome: %s ",this.nome);
        System.out.printf("\nNotas: %f - %f ", this.nota1, this.nota2);
    }
    double calcularMedia(){
        double soma = nota1 + nota2;
        return soma/2;
    }
}