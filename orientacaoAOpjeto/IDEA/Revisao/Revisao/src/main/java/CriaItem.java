import java.util.Scanner;

public class CriaItem {
    public ItemVendavel criar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("================== NOVO ITEM ================== ");
        System.out.println("Tipo:\n1-FISICO\n2-DIGITAL");
        int tipo = leitor.nextInt();

        System.out.println("Nome: ");
        String nome = leitor.next();

        System.out.println("Preço base: ");
        double precoBase = leitor.nextDouble();

        if (tipo == 1){
            System.out.println("Peso (Kg): ");
            double peso = leitor.nextDouble();
            return new ProdutoFisico(peso, nome, precoBase);
        }else{
            System.out.println("Duração em meses: ");
            int duracaoMeses = leitor.nextInt();
            return new ServicoDigital(duracaoMeses, nome, precoBase);
        }
    }
}
