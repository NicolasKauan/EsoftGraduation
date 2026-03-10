public class Main {

    public static void main(String[] args) {

        Paciente paciente = new Paciente(
                "João",
                "123456789",
                "01/01/1990",
                "99999-9999",
                "Unimed"
        );

        Exame exame1 = new ExameSangue();
        Exame exame2 = new RaioX();
        Exame exame3 = new Ultrassom();
        Exame exame4 = new RessonanciaMagnetica();

        Agendamento ag1 = new Agendamento(paciente, exame1, "10/06/2025");
        Agendamento ag2 = new Agendamento(paciente, exame2, "11/06/2025");
        Agendamento ag3 = new Agendamento(paciente, exame3, "12/06/2025");
        Agendamento ag4 = new Agendamento(paciente, exame4, "13/06/2025");

        executarFluxo(ag1);
        executarFluxo(ag2);
        executarFluxo(ag3);
        executarFluxo(ag4);
    }

    public static void executarFluxo(Agendamento agendamento) {

        Exame exame = agendamento.getExame();

        System.out.println("\n--- Preparando exame: " + exame.getNome() + " ---");

        if (exame instanceof IValidavel) {
            ((IValidavel) exame).validarPreRequisitos(agendamento);
        }

        if (exame instanceof IPreparavel) {
            ((IPreparavel) exame).preparar(agendamento);
        }

        if (exame instanceof IReservavel) {
            ((IReservavel) exame).reservarRecurso();
        }
    }
}
