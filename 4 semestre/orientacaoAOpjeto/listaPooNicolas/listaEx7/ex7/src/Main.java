public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Carlos Souza");
        Professor prof2 = new Professor("Ana Lima");

        Disciplina d1 = new Disciplina("Programação Orientada a Objetos");
        Disciplina d2 = new Disciplina("Banco de Dados");
        Disciplina d3 = new Disciplina("Engenharia de Software");

        // Associando disciplinas a professores
        prof1.adicionarDisciplina(d1);
        prof1.adicionarDisciplina(d2);
        prof2.adicionarDisciplina(d3);

        // Exibindo
        System.out.println(prof1);
        System.out.println();
        System.out.println(prof2);
        System.out.println();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
