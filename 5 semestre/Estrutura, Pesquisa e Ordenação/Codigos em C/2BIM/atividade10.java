/*public class PedidoService {

    public void fecharPedido(String cliente, double subtotal, double frete){ 
        if (!pedidoValido(cliente, subtotal)) {
        System.out.println("Pedido inválido"); return;
        }
        double total = calcularTotal(subtotal, frete);

        imprimirResumo(cliente, total);
    }

    private boolean pedidoValido(String cliente, double subtotal){
        return cliente != null && !cliente.isBlank() && subtotal > 0;
    }

    private double calcularTotal(double subtotal, double frete){ 
        return subtotal + frete;
    }

    private void imprimirResumo(String cliente, double total) { 
        System.out.println("Cliente: " + cliente); 
        System.out.println("Total: " + total);
    }
   /*No código, foi mudado a disposição das classes, onde, para melhorar o fluxo de leitura e de logica dele, a 
   classe com as chamadas fora colocada em primeiro, e as classes foram ordenada por ordem de chamada a baixo*/ 
}*/


/*public void cadastrarAluno(String nome, double nota1, double nota2){ 
    String nomeFormatado = nome.trim().toUpperCase();

    double media = (nota1 + nota2) / 2; boolean aprovado = media >= 6;
    
    System.out.println("Aluno: " + nomeFormatado); System.out.println("Média: " + media);
    if (aprovado) {
        System.out.println("Situação: APROVADO");
    } else {
        System.out.println("Situação: REPROVADO");
    }

    System.out.println("Cadastro finalizado");
}*/

/*public class PagamentoService {
    public void processarPagamento(double saldo, double valorCompra){ 
        if (!temSaldo(saldo, valorCompra)) {
            System.out.println("Saldo insuficiente"); return;
        }
        double saldoFinal = debitarSaldo(saldo, valorCompra); emitirRecibo(valorCompra);

        System.out.println("Saldo restante: " + saldoFinal);
    }

    private double debitarSaldo(double saldo, double valorCompra){ 
        registrarLog("Débito realizado");
        return saldo - valorCompra;
    }

    private void registrarLog(String mensagem){ 
        System.out.println("LOG: " + mensagem);
    }

    private void emitirRecibo(double valor){ 
        System.out.println("Recibo emitido: R$" + valor);
    }

    private boolean temSaldo(double saldo, double valorCompra){
        return saldo >= valorCompra;
    }

}*/
/*public class UsuarioUtils {

    public String formatarCPF(String cpf){ 
        return cpf.replace(".", "").replace("-", "");
    }

    public String formatarNome(String nome){ 
        return nome.trim().toUpperCase();
    }

    public String formatarTelefone(String telefone) {
        return telefone.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
    }

    public void enviarNotificacao(String mensagem){ 
        System.out.println("Notificação: " + mensagem);
    }

    public void enviarEmailBoasVindas(String email){ 
        System.out.println("Enviando e-mail para " + email);
    }

    public void registrarAcesso(String usuario){ 
        System.out.println("Acesso registrado para " + usuario);
    }
}*/

/*public class RelatorioService {
    public void gerarRelatorio(String nomeCliente, String email, double valorTotal, double desconto, boolean clientePremium, boolean pagamentoEmDia){
        if (clientePremium && pagamentoEmDia && valorTotal > 1000 && desconto < 0.2){ 
            System.out.println("Relatório especial para: "+ 
            nomeCliente + " | e-mail: " + email + " | valor final: " + 
            (valorTotal - (valorTotal * desconto))); 
        } else{ 
            System.out.println("Relatório padrão para: " + nomeCliente); 
        }
    }
}*/

/*public class AcessoService {
    public void verificarAcesso(boolean ativo, boolean admin, boolean mfaOk){ 
        if (ativo) {
            if (admin){ 
                if (mfaOk) {
                    System.out.println("Acesso administrativo liberado");
                } else {
                    System.out.println("Admin precisa confirmar MFA");
                }
            } else {
                System.out.println("Acesso comum liberado");
            }   
        } else {
            System.out.println("Usuário inativo");
        }
    }
}*/

/*public class MatriculaService {

    public void matricular(String nome,double nota,boolean docsOk,boolean vaga){ 
        if(nome==null||nome.isBlank()){
            System.out.println("Nome inválido");
            return;
        } 
        String nomeFormatado=nome.trim().toUpperCase();
        if(docsOk){
            if(vaga){
                double bonus=calcularBonus(nota); 
                double notaFinal=nota+bonus; 
                salvar(nomeFormatado,notaFinal); 
                enviarEmail(nomeFormatado,notaFinal);
            }else{
                System.out.println("Sem vaga disponível");
            }
        }else{
            System.out.println("Documentação pendente");
        }
    }

    private double calcularBonus(double nota){
        if(nota>=8){
            return 0.5;
        }
        return 0.0;
    }
    
    private void salvar(String nome,double notaFinal){
        log("Salvando matrícula");
        System.out.println("Matrícula de "+nome+" salva com nota "+notaFinal);
    }

    private void log(String msg){
        System.out.println("LOG: "+msg);
    }

    private void enviarEmail(String nome,double notaFinal){
        System.out.println("E-mail enviado para "+nome+" com nota final "+notaFinal);
    }
}*/