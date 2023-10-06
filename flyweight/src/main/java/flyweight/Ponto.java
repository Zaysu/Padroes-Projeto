package flyweight;

public class Ponto {

    private double latitude;
    private double longitude;

    public Ponto(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
