package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DestinoFactory {
    private static Map<String, Destino> destinos = new HashMap<>();

    public static Destino getDestino(String nome, double latitude, double longitude) {
        String chave = nome + "_" + latitude + "_" + longitude;
        Destino destino = destinos.get(chave);
        if (destino == null) {
            Ponto ponto = new Ponto(latitude, longitude);
            destino = new Destino(nome, ponto);
            destinos.put(chave, destino);
        }
        return destino;
    }

    public static int getTotalDestinos() {
        return destinos.size();
    }
}
