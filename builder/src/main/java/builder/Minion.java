package builder;

public class Minion {
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    private int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRespawn() {
        return respawn;
    }

    public void setRespawn(String respawn) {
        this.respawn = respawn;
    }

    private String nome;
    private String tipo;
    private String respawn;

    public Minion(){
        this.vida = 0;
        this.nome = "";
    }
}
