package abstractfactory;

public class FabricaEntregas implements FabricaAbstrata {


    @Override
    public Comprovante createComprovante() { return new ComprovanteEntregas();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoEntregas();
    }
}
