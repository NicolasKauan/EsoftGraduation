// Aula 07 - switch como expressão no Java moderno (Sebesta 8.2.2, p. 334-341)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Switch.java   (Java 14+)
public class Main {
    enum Dia { SEG, TER, QUA, QUI, SEX, SAB, DOM }

    public static void main(String[] args) {
        for (Dia d : Dia.values()) {
            String tipo = switch (d) {         // sem break, sem "cair" no próximo caso
                case SAB, DOM -> "fim de semana";
                case SEG, TER, QUA, QUI, SEX -> "dia útil";
            };                                 // exaustivo: não precisa de default
            System.out.println(d + ": " + tipo);
        }

        int nota = 7;
        String conceito = switch (nota / 2) {
            case 5, 4 -> "A";
            case 3 -> "B";
            default -> {
                String r = "C";
                yield r;                       // yield devolve o valor de um bloco
            }
        };
        System.out.println("conceito " + conceito);   // B
    }
}
