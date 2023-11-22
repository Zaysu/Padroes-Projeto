package observer;
import java.util.Observable;
import java.util.Observer;

public class ObservadorClima implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public ObservadorClima(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof PrevisaoTempo) {
            PrevisaoTempo previsaoTempo = (PrevisaoTempo) o;
            String novaCondicao = (String) arg;
        }
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }
}
