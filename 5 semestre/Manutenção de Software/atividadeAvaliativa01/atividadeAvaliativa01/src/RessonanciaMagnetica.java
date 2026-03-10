public class RessonanciaMagnetica extends Exame implements
        IValidavel, IPreparavel, IReservavel {

    public RessonanciaMagnetica() {
        super("004", "Ressonância Magnética", "Imagem", 60, "Necessário autorização médica");
    }

    @Override
    public void validarPreRequisitos(Agendamento agendamento) {
        System.out.println("Validando autorização e questionário do paciente "
                + agendamento.getPaciente().getNome());
    }

    @Override
    public void preparar(Agendamento agendamento) {
        System.out.println("Gerando instruções de preparo para o paciente "
                + agendamento.getPaciente().getNome());

        System.out.println("Resumo da preparação registrado.");
    }

    @Override
    public void reservarRecurso() {
        System.out.println("Reservando equipamento de ressonância magnética.");
    }
}
