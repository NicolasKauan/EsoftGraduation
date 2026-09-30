// Aula 07 - Avaliação em curto-circuito (Sebesta 7.6, p. 315-317)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java CurtoCircuito.java
public class Main {
    static int chamadas = 0;

    static boolean caro() {
        chamadas++;
        return true;
    }

    public static void main(String[] args) {
        // Busca do livro (p. 316): o && impede o acesso fora da matriz
        int[] lista = {4, 8, 15};
        int chave = 99, indice = 0;
        while (indice < lista.length && lista[indice] != chave)
            indice++;
        System.out.println("indice = " + indice);      // 3: não achou, e sem exceção

        boolean r1 = false && caro();    // curto-circuito: caro() NÃO é chamada
        boolean r2 = false & caro();     // & com booleanos: avalia os dois lados
        System.out.println("chamadas = " + chamadas);  // 1

        String s = null;
        System.out.println(s != null && s.length() > 0);   // false
        try {
            System.out.println(s != null & s.length() > 0);
        } catch (NullPointerException e) {
            System.out.println("com & : NullPointerException");
        }
    }
}
