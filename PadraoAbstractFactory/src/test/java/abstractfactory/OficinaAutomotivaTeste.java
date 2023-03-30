package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OficinaAutomotivaTeste {

    @Test
    void deveEmitirHistoricoSolicitacoes() {
        FabricaAbstrata fabrica = new FabricaSolicitacoes();
        OficinaAutomotiva usuario = new OficinaAutomotiva(fabrica);
        assertEquals("Histórico de Solicitações", usuario.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoEntregas() {
        FabricaAbstrata fabrica = new FabricaEntregas();
        OficinaAutomotiva usuario = new OficinaAutomotiva(fabrica);
        assertEquals("Histórico de Entregas", usuario.emitirHistorico());
    }

    @Test
    void deveEmitirComprovanteSolicitacoes() {
        FabricaAbstrata fabrica = new FabricaSolicitacoes();
        OficinaAutomotiva usuario = new OficinaAutomotiva(fabrica);
        assertEquals("Comprovante de Solicitações", usuario.emitirComprovante());
    }

    @Test
    void deveEmitirComprovanteEntregas() {
        FabricaAbstrata fabrica = new FabricaEntregas();
        OficinaAutomotiva usuario = new OficinaAutomotiva(fabrica);
        assertEquals("Comprovante de Entregas", usuario.emitirComprovante());
    }


}