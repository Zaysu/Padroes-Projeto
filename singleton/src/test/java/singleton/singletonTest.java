package singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class singletonTest {

    @Test
    public void deveRetornarTrocaDeDadosDoUsuario() {
        Parametros.getInstance().setTrocaInformacoes("Trocando Dados Usuario");
        assertEquals("Trocando Dados Usuario", Parametros.getInstance().getTrocaInformacoes());
    }
}