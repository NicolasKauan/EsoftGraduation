public class ContaBancaria {
    Double saldo;
    String numeroConta;
    String agencia;
    Pessoa titular;
    Cartao[] cartoes;

    ContaBancaria(Double saldo, String numeroConta, String agencia,
                  String nome, String cpf, String dataNascimento) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        titular = new Pessoa(nome,cpf,dataNascimento);
    }
}