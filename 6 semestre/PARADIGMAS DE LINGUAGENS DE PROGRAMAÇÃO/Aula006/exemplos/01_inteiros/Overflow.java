// Aula 06 - Tipos de dados primitivos: inteiros (Sebesta 6.2.1.1, p. 236)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Overflow.java      (Java 11+)
public class Main {
    public static void main(String[] args) {
        System.out.println("byte : " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
        System.out.println("int  : " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
        System.out.println("long : " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);

        int x = Integer.MAX_VALUE;
        x = x + 1;                                // estouro SILENCIOSO: "dá a volta"
        System.out.println("MAX_VALUE + 1 = " + x);

        byte b = 127;
        b++;
        System.out.println("byte 127 + 1  = " + b);

        try {
            Math.addExact(Integer.MAX_VALUE, 1);  // versão que verifica o estouro
        } catch (ArithmeticException e) {
            System.out.println("Math.addExact: " + e.getMessage());
        }
    }
}
