package flyweight;

public class Destino {

    private String nome;
    private Ponto localizacao;

    public Destino(String nome, Ponto localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String obterDestino() {
        return "Destino{" +
                "nome='" + this.nome + '\'' +
                ", latitude='" + localizacao.getLatitude() + '\'' +
                ", longitude='" + localizacao.getLongitude() + '\'' +
                '}';
    }
}
