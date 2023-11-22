package state;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaTest {

    Conta conta;

    @BeforeEach
    public void setConta(){
        conta = new Conta();
    }

    @Test
    public void deveTransferir() {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.depositar(1000);

        assertTrue(conta1.transferir(conta2, 500));
        assertEquals(500, conta2.getSaldo());
        assertEquals(500, conta1.getSaldo());
    }
}