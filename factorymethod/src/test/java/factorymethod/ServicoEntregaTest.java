package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEntregaTest {

    @Test
    void deveExecutarEntrega() {
        IServico servico = ServicoFactury.obterServico("Entrega");
        assertEquals("Entrega agendada", servico.executar());
    }
    @Test
    void deveCancelarEntrega() {
        IServico servico = ServicoFactury.obterServico("Entrega");
        assertEquals("Entrega cancelada", servico.cancelar());
    }
}