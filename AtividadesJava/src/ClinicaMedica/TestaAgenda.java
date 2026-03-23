package ClinicaMedica;

import java.time.LocalDateTime;

public class TestaAgenda {
    public static void main(String[] args) {
        Medico doutor = new Medico("Ricardo Oliveira", 8842, "Cardiologista");
        Paciente pessoaAtendida = new Paciente(501, "Fernanda Souza", "987.654.321-00");
        LocalDateTime dataHoraAgendada = LocalDateTime.of(2026, 5, 20, 9, 30);
        Consulta agendamento = new Consulta(dataHoraAgendada, 250.00f, doutor, pessoaAtendida);
        System.out.println(agendamento.toString());
    }
}