public class RaioX extends Exame implements IValidavel, IReservavel {

    public RaioX() {
        super("002", "Raio X", "Imagem", 20, "Sem objetos metálicos");
    }

    @Override
    public void validarPreRequisitos(Agendamento agendamento) {
        System.out.println("Validando pré requisitos de imagem para "
                + agendamento.getPaciente().getNome());
    }

    @Override
    public void reservarRecurso() {
        System.out.println("Sala e equipamento de Raio-X reservados.");
    }
}
