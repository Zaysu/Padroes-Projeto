package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAgendamentoTest {
    @Test
    void deveExecutarAgendamento() {
        IServico servico = ServicoFactury.obterServico("Agendamento");
        assertEquals("Agendamento realizado", servico.executar());
    }
    @Test
    void deveCancelarAgendamento() {
        IServico servico = ServicoFactury.obterServico("Agendamento");
        assertEquals("Agendamento cancelado", servico.cancelar());
    }
}