package state;

public class ContaEstadoFechada extends ContaEstado {

    private ContaEstadoFechada() {};
    private static ContaEstadoFechada instance = new ContaEstadoFechada();
    public static ContaEstadoFechada getInstance() {
        return instance;
    }

    public boolean depositar(Conta conta, double valor) {
        return false;
    }

    public boolean sacar(Conta conta, double valor) {
        return false;
    }

    public boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        return false;
    }

    public boolean fechar(Conta conta) {
        return true;
    }

}
