package templatemethod;

public class CalculadoraSoma extends Calculadora {

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }

    @Override
    public String getTipo() {
        return "CalculadoraSoma";
    }
}
