package templatemethod;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteCalculadoraTemplateMethod {

    @Test
    void deveRetonarSoma() {
        Calculadora calculadora = new CalculadoraSoma();
        assertEquals(5.0, calculadora.calcular(2.0, 3.0));
    }

    @Test
    void deveRetonarSubtracao() {
        Calculadora calculadora = new CalculadoraSubtracao();
        assertEquals(-1.0, calculadora.calcular(2.0, 3.0));
    }
}

