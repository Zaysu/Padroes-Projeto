package builder;

public class MinionBuilder {
    private Minion minion;
    public MinionBuilder(){
        minion = new Minion();
    }

    public Minion build() {
        if(minion.getVida() == 0){
            throw new IllegalArgumentException("Minion Invalido");
        }
        if(minion.getNome().equals("")) {
            throw new IllegalArgumentException("Nome Invalido");
        }
        return minion;
    }

    public MinionBuilder setNome(String nome) {
        minion.setNome(nome);
        return this;
    }
    public MinionBuilder setVida(int vida) {
        minion.setVida(vida);
        return this;
    }
    public MinionBuilder setTipo(String tipo) {
        minion.setTipo(tipo);
        return this;
    }
    public MinionBuilder setRespawn(String respawn) {
        minion.setRespawn(respawn);
        return this;
    }
}
