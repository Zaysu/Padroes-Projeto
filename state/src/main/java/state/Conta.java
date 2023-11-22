package state;

public class Conta {

    private String numero;
    private double saldo;
    private ContaEstado estado;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.estado = ContaEstadoAberta.getInstance();
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
    }

    public boolean depositar(double valor) {
        return estado.depositar(this, valor);
    }

    public boolean sacar(double valor) {
        return estado.sacar(this, valor);
    }

    public boolean transferir(Conta destino, double valor) {
        return estado.transferir(this, destino, valor);
    }

    public boolean fechar() {
        return estado.fechar(this);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaEstado getEstado() {
        return estado;
    }
}
