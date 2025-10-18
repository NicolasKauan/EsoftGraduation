public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro");

        Livro livro1 = new Livro("Dom Casmurro", autor);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor);
        
        livro1.exibirLivro();
        livro2.exibirLivro();
    }
}
