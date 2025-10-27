public class PortaDeSeguranca implements DispositivoEletronico, Autenticavel {
    private boolean ligada;
    private boolean aberta;
    private String senhaConfig;

    public PortaDeSeguranca(String senhaConfig) {
        this.senhaConfig = senhaConfig;
    }

    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("Porta de segurança energizada.");
    }

    @Override
    public void desligar() {
        this.ligada = false;
        this.aberta = false;
        System.out.println("Porta de segurança desligada.");
    }

    @Override
    public boolean autenticar(String senha) {
        boolean ok = this.ligada && this.senhaConfig.equals(senha);
        System.out.println(ok ? "Autenticado!" : "Falha de autenticação.");
        if (ok) this.aberta = true;
        return ok;
    }

    public void fechar() {
        if (!ligada) {
            System.out.println("Não é possível fechar: porta desligada.");
            return;
        }
        this.aberta = false;
        System.out.println("Porta fechada.");
    }

    public boolean isAberta() {
        return aberta;
    }
}
