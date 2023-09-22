package factorymethod;

public class ServicoAgendamento implements IServico{
    public String executar() {
        return "Agendamento realizado";
    }

    public String cancelar() {

        return "Agendamento cancelado";
    }
}
