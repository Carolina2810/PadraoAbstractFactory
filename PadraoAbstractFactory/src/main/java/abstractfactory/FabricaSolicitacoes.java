package abstractfactory;

public class FabricaSolicitacoes implements FabricaAbstrata {

    @Override
    public Comprovante createComprovante() { return new ComprovanteSolicitacoes();  }

    @Override
    public Historico createHistorico() {
        return new HistoricoSolicitacoes();
    }
}
