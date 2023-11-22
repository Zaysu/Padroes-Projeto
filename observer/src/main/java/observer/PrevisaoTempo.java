package observer;
import java.util.Observable;

public class PrevisaoTempo extends Observable {
    private String condicaoAtual;

    public void setCondicaoAtual(String condicaoAtual) {
        this.condicaoAtual = condicaoAtual;
        setChanged();
        notifyObservers(condicaoAtual);
    }

    public String getCondicaoAtual() {
        return condicaoAtual;
    }
}
