package prototype;

public class Pessoa implements Cloneable {
    private String nome;
    private Playlist playlist;


    public Pessoa(String nome, Playlist playlist ) {
        this.nome = nome;
        this.playlist = playlist;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        Pessoa pessoaClone = (Pessoa) super.clone();
        pessoaClone.playlist = (Playlist) pessoaClone.playlist.clone();
        return pessoaClone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + nome +
                ", playlist='" + playlist + '\'' +
                '}';
    }
}
