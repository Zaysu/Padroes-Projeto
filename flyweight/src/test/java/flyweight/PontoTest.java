package flyweight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PontoTest {

    @Test
    void deveCriarPontoComLatitudeELongitudeCorretas() {
        double latitude = 40.7128;
        double longitude = -74.0060;

        Ponto ponto = new Ponto(latitude, longitude);

        assertEquals(latitude, ponto.getLatitude());
        assertEquals(longitude, ponto.getLongitude());
    }

    @Test
    void deveCriarDoisPontosDiferentesComMesmaLatitudeLongitude() {
        double latitude = 34.0522;
        double longitude = -118.2437;

        Ponto ponto1 = new Ponto(latitude, longitude);
        Ponto ponto2 = new Ponto(latitude, longitude);

        assertNotSame(ponto1, ponto2);
    }

    @Test
    void deveCriarPontosIguaisComMesmaLatitudeLongitudeUsandoFactory() {
        double latitude = 34.0522;
        double longitude = -118.2437;

        Ponto ponto1 = PontoFactory.getPonto(latitude, longitude);
        Ponto ponto2 = PontoFactory.getPonto(latitude, longitude);

        assertSame(ponto1, ponto2);
    }

    @Test
    void deveRetornarTotalPontosCriados() {
        double latitude1 = 40.7128;
        double longitude1 = -74.0060;
        double latitude2 = 34.0522;
        double longitude2 = -118.2437;

        Ponto ponto1 = PontoFactory.getPonto(latitude1, longitude1);
        Ponto ponto2 = PontoFactory.getPonto(latitude2, longitude2);

        assertEquals(2, PontoFactory.getTotalPontos());
    }
}