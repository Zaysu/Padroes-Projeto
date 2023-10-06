package prototype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class PessoaTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Pessoa pessoa = new Pessoa("José", new Playlist("PlaylistJazz", "Jazz"));

        Pessoa pessoaClone = pessoa.clone();
        pessoaClone.setNome("José");
        pessoaClone.getPlaylist().setGenero("Jazz");

        assertEquals("Pessoa{nome='José', playlist=Playlist{nome='PlaylistJazz', genero='Jazz'}}", pessoa.toString());
        assertEquals("Pessoa{nome='José', playlist=Playlist{nome='PlaylistJazz', genero='Jazz'}}", pessoaClone.toString());

    }

}