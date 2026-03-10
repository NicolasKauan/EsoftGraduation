public class Agendamento {
    private Paciente paciente;
    private Exame exame;
    private String data;
    private String status;

    public Agendamento(Paciente paciente, Exame exame, String data) {
        this.paciente = paciente;
        this.exame = exame;
        this.data = data;
        this.status = "PENDENTE";
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

