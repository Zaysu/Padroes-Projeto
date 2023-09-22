package singleton;

public class Parametros {
    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String trocaInformacoes;

    public String getTrocaInformacoes() {
        return trocaInformacoes;
    }

    public void setTrocaInformacoes(String trocaInformacoes) {
        this.trocaInformacoes = trocaInformacoes;
    }
}
