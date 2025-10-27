public class RelatorioHTML extends GeradorDeRelatorio {

    @Override
    protected String construirCabecalho() {
        return "<header><h1>Relatório HTML</h1></header>";
    }

    @Override
    protected String construirCorpo() {
        return "<main><p>Corpo do relatório em HTML.</p></main>";
    }

    @Override
    protected String construirRodape() {
        return "<footer><small>Gerado automaticamente</small></footer>";
    }
}
