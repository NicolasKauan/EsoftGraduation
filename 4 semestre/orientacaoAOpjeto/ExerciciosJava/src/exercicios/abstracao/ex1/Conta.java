package exercicios/abstracao/ex1;
public abstract class Conta {
    protected String titular;
    protected double saldo;
    public Conta(String titular, double saldo) { this.titular = titular; this.saldo = saldo; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public abstract void calcularTaxas();
}
