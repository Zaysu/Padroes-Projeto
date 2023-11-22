package observer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ObservadorClimaTest {
    @Test
    void deveNotificarUmObservador() {
        PrevisaoTempo previsaoTempo = new PrevisaoTempo();
        ObservadorClima observador = new ObservadorClima("Usuario1");
        previsaoTempo.addObserver(observador);

        previsaoTempo.setCondicaoAtual("Ensolarado");

        // Verifica se o observador foi notificado corretamente
        assertEquals("Usuario1: Nova condição climática recebida - Ensolarado", observador.getUltimaNotificacao());
    }

    @Test
    void deveNotificarObservadores() {
        PrevisaoTempo previsaoTempo = new PrevisaoTempo();
        ObservadorClima observador1 = new ObservadorClima("Usuario1");
        ObservadorClima observador2 = new ObservadorClima("Usuario2");
        previsaoTempo.addObserver(observador1);
        previsaoTempo.addObserver(observador2);

        previsaoTempo.setCondicaoAtual("Chuvoso");

        // Verifica se ambos os observadores foram notificados corretamente
        assertEquals("Usuario1: Nova condição climática recebida - Chuvoso", observador1.getUltimaNotificacao());
        assertEquals("Usuario2: Nova condição climática recebida - Chuvoso", observador2.getUltimaNotificacao());
    }
}