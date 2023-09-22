package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoReservaTest {

    @Test
    void deveExecutaReserva() {
        IServico servico = ServicoFactury.obterServico("Reserva");
        assertEquals("Reserva realizada", servico.executar());
    }
    @Test
    void deveCancelarReserva() {
        IServico servico = ServicoFactury.obterServico("Reserva");
        assertEquals("Reserva cancelada", servico.cancelar());
    }

}