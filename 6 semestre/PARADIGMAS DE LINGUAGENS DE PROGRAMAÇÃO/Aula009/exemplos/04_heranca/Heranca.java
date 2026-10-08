// Aula 09 - Herança e sobrescrita (Sebesta 12.2.2, p. 489-492)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
// Local:  java Heranca.java
class Ave {                                          // classe pai (superclasse)
    protected String nome;                           // visível para as subclasses
    private int batidas = 0;                         // NÃO visível para as subclasses

    Ave(String nome) { this.nome = nome; }

    String desenhar() { return nome + ": ave genérica"; }
    String voar() { batidas++; return nome + " voa (" + batidas + ")"; }
}

class AveAquatica extends Ave {                      // subclasse (classe derivada)
    AveAquatica(String nome) { super(nome); }        // chama o construtor do pai

    @Override
    String desenhar() { return nome + ": ave aquática (um pato?)"; }   // sobrescreve (p. 491)

    String nadar() { return nome + " nada"; }        // método novo
}

public class Main {
    public static void main(String[] args) {
        Ave a = new Ave("Bem-te-vi");
        AveAquatica p = new AveAquatica("Pato");
        System.out.println(a.desenhar());
        System.out.println(p.desenhar());            // a versão sobrescrita
        System.out.println(p.voar());                // herdado sem mudanças
        System.out.println(p.nadar());
    }
}
