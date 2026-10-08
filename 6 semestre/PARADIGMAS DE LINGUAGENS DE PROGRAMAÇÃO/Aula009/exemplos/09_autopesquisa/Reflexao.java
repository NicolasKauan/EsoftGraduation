// Autopesquisa - Reflexão em Java (Sebesta 12.6.3, p. 530-533)
// Online: https://onecompiler.com/java  (cole o código inteiro; a classe principal se chama Main)
// Local:  java Reflexao.java
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Pessoa {
    private String nome = "Ana";
    public String saudar(String outro) { return nome + " cumprimenta " + outro; }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Pessoa");               // obtém a classe pelo NOME
        Object obj = c.getDeclaredConstructor().newInstance();
        Method saudar = c.getMethod("saudar", String.class);
        System.out.println(saudar.invoke(obj, "Bia"));      // chamada descoberta em execução
        Field campo = c.getDeclaredField("nome");
        campo.setAccessible(true);                          // fura o private!
        System.out.println("campo privado: " + campo.get(obj));
    }
}
