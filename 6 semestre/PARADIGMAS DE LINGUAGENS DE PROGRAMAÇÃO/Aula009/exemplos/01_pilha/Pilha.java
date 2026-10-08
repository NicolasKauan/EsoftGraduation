// Aula 09 - O TAD pilha em Java (Sebesta 11.4.3, p. 463-465)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
// Local:  java Pilha.java
class Pilha {                              // em um projeto real, ficaria no arquivo Pilha.java
    private int[] dados;                   // representação OCULTA dos clientes
    private int indiceTopo = -1;

    Pilha(int capacidade) {                // construtor: inicializa o objeto (p. 454)
        dados = new int[capacidade];
    }

    public void empilhar(int x) {
        if (indiceTopo == dados.length - 1) throw new IllegalStateException("pilha cheia");
        dados[++indiceTopo] = x;
    }

    public int desempilhar() {
        if (vazia()) throw new IllegalStateException("pilha vazia");
        return dados[indiceTopo--];
    }

    public int topo() {
        if (vazia()) throw new IllegalStateException("pilha vazia");
        return dados[indiceTopo];
    }

    public boolean vazia() { return indiceTopo == -1; }
}

public class Main {
    public static void main(String[] args) {      // cliente, como o TstStack do livro (p. 464)
        Pilha p = new Pilha(10);
        p.empilhar(42);
        p.empilhar(29);
        System.out.println("29 is: " + p.topo());
        p.desempilhar();
        System.out.println("42 is: " + p.topo());
        // p.indiceTopo = 5;    // ERRO de compilação: indiceTopo tem acesso privado
        // Não há destrutor: a coleta de lixo libera a memória (p. 464)
    }
}
