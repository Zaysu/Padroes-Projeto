package state;

public abstract class ContaEstado {

    public abstract boolean depositar(Conta conta, double valor);

    public abstract boolean sacar(Conta conta, double valor);

    public abstract boolean transferir(Conta contaOrigem, Conta contaDestino, double valor);

    public abstract boolean fechar(Conta conta);

}
