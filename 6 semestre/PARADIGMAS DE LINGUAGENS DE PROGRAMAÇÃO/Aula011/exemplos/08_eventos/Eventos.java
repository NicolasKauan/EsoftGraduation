// Aula 11 - O modelo de eventos de Java: fonte, objeto de evento e ouvintes (Sebesta 14.6, p. 617-622)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Eventos.java
// Simulação sem interface gráfica: no Swing seria botao.addActionListener(e -> ...)
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    record EventoClique(String origem, int x, int y) {}         // objeto de evento

    static class Botao {                                         // fonte de eventos
        private final String nome;
        private final List<Consumer<EventoClique>> ouvintes = new ArrayList<>();
        Botao(String nome) { this.nome = nome; }
        void adicionarOuvinte(Consumer<EventoClique> o) { ouvintes.add(o); }   // registro
        void clicar(int x, int y) {                              // o sistema dispara o evento
            EventoClique e = new EventoClique(nome, x, y);
            for (var o : ouvintes) o.accept(e);                  // chama cada tratador
        }
    }

    public static void main(String[] args) {
        Botao salvar = new Botao("Salvar");
        salvar.adicionarOuvinte(e -> System.out.println("salvando... (clique em " + e.x() + "," + e.y() + ")"));
        salvar.adicionarOuvinte(e -> System.out.println("registro: " + e.origem() + " foi clicado"));
        salvar.clicar(10, 20);    // numa GUI real, quem chama é o laço de eventos
    }
}
