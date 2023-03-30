package abstractfactory;

public class OficinaAutomotiva {

    private Comprovante comprovante;
    private Historico historico;

    public OficinaAutomotiva( FabricaAbstrata fabrica) {
        this.comprovante = fabrica.createComprovante();
        this.historico = fabrica.createHistorico();
    }

    public String emitirComprovante() {
        return this.comprovante.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
