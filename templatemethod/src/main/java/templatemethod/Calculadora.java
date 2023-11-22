package templatemethod;

public abstract class Calculadora {

    public abstract double calcular(double a, double b);

    public String getTipo() {
        return "Calculadora";
    }
}
