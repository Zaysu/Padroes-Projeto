package factorymethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoFacturyTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactury.obterServico("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactury.obterServico("Jubilamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

}