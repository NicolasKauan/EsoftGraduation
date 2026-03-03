package exercicios/interfaces/ex3;
public class PortaDeSeguranca implements DispositivoEletronico, Autenticavel {
    private boolean ligada;
    private boolean aberta;
    private String senhaConfig;
    public PortaDeSeguranca(String senhaConfig) { this.senhaConfig = senhaConfig; }
    @Override public void ligar() { ligada = true; System.out.println("Porta energizada."); }
    @Override public void desligar() { ligada = false; aberta = false; System.out.println("Porta desligada."); }
    @Override public boolean autenticar(String senha) {
        boolean ok = ligada && senhaConfig.equals(senha);
        System.out.println(ok ? "Autenticado!" : "Falha de autenticação.");
        if (ok) aberta = true;
        return ok;
    }
    public void fechar() {
        if (!ligada) { System.out.println("Não é possível fechar: porta desligada."); return; }
        aberta = false; System.out.println("Porta fechada.");
    }
    public boolean isAberta() { return aberta; }
}
