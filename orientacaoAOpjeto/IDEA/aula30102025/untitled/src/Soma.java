import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    public void soma(int a, int b){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;



        try{
            int z = x/y;
        }catch(ArithmeticException e){
            System.out.println("Divisao por 0");
        } catch(InputMismatchException e){
            System.out.println("Digite apenas numeros inteiros");
        }
    }
}
