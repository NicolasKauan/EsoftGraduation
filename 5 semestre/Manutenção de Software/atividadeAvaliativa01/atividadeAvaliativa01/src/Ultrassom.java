public class Ultrassom extends Exame implements IPreparavel, IReservavel {

    public Ultrassom() {
        super("003", "Ultrassom", "Imagem", 25, "Beber água antes do exame");
    }

    @Override
    public void preparar(Agendamento agendamento) {
        System.out.println("Gerando instruções de preparo para o paciente "
                + agendamento.getPaciente().getNome());

        System.out.println("Resumo da preparação registrado.");
    }

    @Override
    public void reservarRecurso() {
        System.out.println("Sala e equipamento de Ultrassom reservados.");
    }
}