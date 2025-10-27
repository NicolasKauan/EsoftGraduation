public class Main {
    public static void main(String[] args) {
        GeradorDeRelatorio rel = new RelatorioHTML();
        String conteudo = rel.gerarRelatorio();
        System.out.println(conteudo);
    }
}
