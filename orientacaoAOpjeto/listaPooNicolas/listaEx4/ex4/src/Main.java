public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro");

        Livro livro1 = new Livro("Dom Casmurro", autor);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor);

        System.out.printf("Livro 1: %s\n", livro1);
        System.out.printf("Livro 2: %s\n", livro2);

    }
}
