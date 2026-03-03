public class Banho {
    String sabao;
    double qtdAgua;
    Cachorro cachorro;
    Pessoa[] funcionado;

    Banho(String sabao, double qtdAgua, Cachorro cachorro, Pessoa funcionado){
        this.sabao = sabao;
        this.qtdAgua = qtdAgua;
        this.cachorro = cachorro;
        this.funcionado = new Pessoa[4];
        this.funcionado[0] = funcionado;
    }

    void printBanho(){
        System.out.println("============================");
        System.out.println("Banho");
        System.out.printf("Sabao: %s\n", sabao);
        System.out.printf("Quantidade de agua ideal: %f\n", qtdAgua);
        System.out.printf("Cachorro: %s\n", cachorro.nome);

        for (int i =0; i<4; i++){
            if (funcionado[i] != null){
                System.out.printf("Funcionario: %s\n", funcionado[i].nome);
            }
        }

        System.out.println("============================");
    }

    void addFuncionario(Pessoa funcionario){

        if (funcionario.matricula != 0){

            for (int i =0; i<4; i++){

                if (funcionado[i] == null){

                    funcionado[i] = funcionario;
                    break;
                }
            }
        }
    }
}
