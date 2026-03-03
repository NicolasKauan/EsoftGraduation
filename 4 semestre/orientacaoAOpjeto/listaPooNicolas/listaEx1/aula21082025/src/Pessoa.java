public class Pessoa {

    String nome;

    int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void fazerAniversario(){
         idade++;
    }
    void exibirIdade(){
        System.out.printf("O %s tem  ", nome);
        System.out.println("Idade: " + idade);
    }
}
