package Bridge;

public class Analista1 extends Cargo {

    public Analista1(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }
}