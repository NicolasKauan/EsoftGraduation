public class Cachorro {
    String nome;
    Pessoa dono;

    Cachorro(String nome, int matriculaDono, String nomeDono){
        this.nome = nome;
        dono = new Pessoa(matriculaDono, nomeDono);
    }

    void printValores(){
        System.out.println("============================");
        System.out.println("Cachorro");
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Dono: %d - %s\n", this.dono.matricula, this.dono.nome);
        System.out.println("============================");
    }

}
