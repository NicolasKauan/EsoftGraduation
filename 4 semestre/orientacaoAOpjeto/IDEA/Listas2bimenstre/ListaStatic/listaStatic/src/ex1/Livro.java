package ex1;
public class Livro {
    private static int contador = 0;
    public Livro(String Titulo){
        contador++;
    };
    public static int getContador(){
        return contador;
    }


}
