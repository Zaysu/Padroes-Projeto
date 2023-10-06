package flyweight;

public class Passageiro {

    private String nome;
    private Destino destino;

    public Passageiro(String nome, Destino destino) {
        this.nome = nome;
        this.destino = destino;
    }

    public String obterPassageiro() {
        return "Passageiro{" +
                "nome='" + this.nome + '\'' +
                ", destino='" + destino.obterDestino() + '\'' +
                '}';
    }
}

