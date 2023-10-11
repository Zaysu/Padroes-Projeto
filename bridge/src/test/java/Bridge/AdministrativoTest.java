package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Analista1Test {

    @Test
    void deveRetornarSalarioAnalista1ComEnsinoMedio() {
        Analista1 analista1 = new Analista1(1000.0f);
        assertEquals(1000.0f, analista1.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalista1ComGraduacao() {
        Analista1 analista1 = new Analista1(1000.0f);
        assertEquals(1100.0f, analista1.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalista1ComMestrado() {
        Analista1 analista1 = new Analista1(1000.0f);
        assertEquals(1200.0f, analista1.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalista1ComDoutorado() {
        Analista1 analista1 = new Analista1(1000.0f);
        assertEquals(1300.0f, analista1.calcularSalario(), 0.01f);
    }
}