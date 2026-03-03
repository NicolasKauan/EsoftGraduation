public class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    void exibirLivro() {
        System.out.println("Titulo: " + this.titulo);
        System.out.printf("Autor: %s\n", autor.nome);
    }
}
