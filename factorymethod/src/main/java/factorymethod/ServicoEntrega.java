package factorymethod;

public class ServicoEntrega implements IServico {
    public String executar() {

        return "Entrega agendada";
    }

    public String cancelar() {
        return "Entrega cancelada";
    }
}
