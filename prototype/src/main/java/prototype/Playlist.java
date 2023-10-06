package prototype;

public class Playlist {
    private String titulo;
    private String genero;

    public Playlist(String titulo, String genero) {
        super();
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "Titulo='" + titulo + '\'' +
                ", Genero=" + genero +
                '}';
    }



}
