package ClinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime horario;
    private float custo;
    private Medico profissional;
    private Paciente cliente;

    public Consulta() {
    }

    public Consulta(LocalDateTime horario, float custo, Medico profissional, Paciente cliente) {
        this.horario = horario;
        this.custo = custo;
        this.profissional = profissional;
        this.cliente = cliente;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public Medico getProfissional() {
        return profissional;
    }

    public void setProfissional(Medico profissional) {
        this.profissional = profissional;
    }

    public Paciente getCliente() {
        return cliente;
    }

    public void setCliente(Paciente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        String info = "RELATÓRIO DE CONSULTA\n";
        info += "Agendamento: " + horario.format(dtf) + "\n";
        info += "Valor: R$ " + String.format("%.2f", custo) + "\n";
        info += "Doutor(a): " + profissional + "\n";
        info += "Paciente: " + cliente;
        return info;
    }
}