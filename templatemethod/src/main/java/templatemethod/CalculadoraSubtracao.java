package templatemethod;
public class CalculadoraSubtracao extends Calculadora {

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }

    @Override
    public String getTipo() {
        return "CalculadoraSubtracao";
    }
}

