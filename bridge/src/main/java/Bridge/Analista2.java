package Bridge;

public class Analista2 extends Cargo {

    public Analista2(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (2 + this.escolaridade.percentualAumento());
    }
}