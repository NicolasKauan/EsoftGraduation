public abstract class GeradorDeRelatorio {

    public final String gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append(construirCabecalho()).append("\n");
        sb.append(construirCorpo()).append("\n");
        sb.append(construirRodape());
        return sb.toString();
    }

    protected abstract String construirCabecalho();
    protected abstract String construirCorpo();
    protected abstract String construirRodape();
}
