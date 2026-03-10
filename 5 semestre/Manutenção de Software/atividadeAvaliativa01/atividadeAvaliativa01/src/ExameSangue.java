public class ExameSangue extends Exame implements IValidavel, IPreparavel {

    public ExameSangue() {
        super("001", "Exame de Sangue", "Laboratorial", 10, "Jejum obrigatório");
    }

    @Override
    public void preparar(Agendamento agendamento) {
        System.out.println("Preparando exame de sangue para o paciente "
                + agendamento.getPaciente().getNome());

        System.out.println("Resumo da preparação registrado.");
    }

    @Override
    public void validarPreRequisitos(Agendamento agendamento) {
        System.out.println("Validando jejum do paciente "
                + agendamento.getPaciente().getNome());
    }
}
