package state;

public class ContaEstadoAberta extends ContaEstado {

    private ContaEstadoAberta() {};
    private static ContaEstadoAberta instance = new ContaEstadoAberta();
    public static ContaEstadoAberta getInstance() {
        return instance;
    }

    public boolean depositar(Conta conta, double valor) {
        conta.saldo += valor;
        return true;
    }

    public boolean sacar(Conta conta, double valor) {
        if (conta.saldo >= valor) {
            conta.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem.saldo >= valor) {
            contaOrigem.saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean fechar(Conta conta) {
        return false;
    }

}
