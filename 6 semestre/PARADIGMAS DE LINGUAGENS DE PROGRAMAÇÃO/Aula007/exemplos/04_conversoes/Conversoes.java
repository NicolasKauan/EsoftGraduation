// Aula 07 - Conversões de tipos (Sebesta 7.4, p. 310-313)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe se chama Main)
// Local:  java Conversoes.java
public class Main {
    public static void main(String[] args) {
        // Alargamento (widening): implícito, mas pode perder precisão (p. 311)
        int grande = 123456789;
        float f = grande;                   // coerção int -> float
        System.out.println(f);              // 1.2345679E8
        System.out.println((int) f);        // 123456792: perdeu dígitos!

        // Estreitamento (narrowing): exige conversão explícita (cast)
        double d = 3.99;
        System.out.println((int) d);        // 3: trunca
        System.out.println((byte) 200);     // -56: sobram só os 8 bits de baixo

        // byte e short sofrem coerção para int em expressões (p. 312)
        byte b = 10, c = 20;
        // byte soma = b + c;               // ERRO de compilação: b + c é int
        byte soma = (byte) (b + c);
        System.out.println(soma);           // 30

        // Divisão inteira x divisão real
        System.out.println(1 / 2);          // 0
        System.out.println(1 / 2.0);        // 0.5: o 1 sofre coerção para double
    }
}
