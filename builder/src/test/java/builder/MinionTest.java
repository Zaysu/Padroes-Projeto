package builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MinionTest {

    @Test
    void deveRetornarExcecaoParaMinionSemVida() {
        try {
            MinionBuilder minionBuilder = new MinionBuilder();
            Minion minion = minionBuilder
                    .setNome("Minion 1")
                    .setVida(256)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Minion Sem Vida", e.getMessage());
        }
    }
    @Test
    void deveRetornarExececaoParaMinionSemTipo() {
        try {
            MinionBuilder minionBuilder = new MinionBuilder();
            Minion minion = minionBuilder
                    .setNome("Minion 1")
                    .setTipo("Mago")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarMinionValido() {
        MinionBuilder minionBuilder = new MinionBuilder();
        Minion minion = minionBuilder
                .setRespawn("Base")
                .setNome("Minion 1")
                .setTipo("Mago")
                .setVida(255)
                .build();

        assertNotNull(minion);
    }
}