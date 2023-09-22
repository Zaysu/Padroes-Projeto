package factorymethod;

public class ServicoReserva implements IServico{
    public String executar() {
        return "Reserva realizada";
    }

    public String cancelar() {
        return "Reserva cancelada";
    }
}
