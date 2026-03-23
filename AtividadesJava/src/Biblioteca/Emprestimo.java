package Biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private Leitor usuario;
    private Livro obra;
    private LocalDateTime dataSaida;
    private LocalDateTime prazoEntrega;

    public Emprestimo() {
    }

    public Emprestimo(Leitor usuario, Livro obra) {
        this.dataSaida = LocalDateTime.now();
        this.prazoEntrega = dataSaida.plusDays(20);
        this.usuario = usuario;
        this.obra = obra;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDateTime getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDateTime prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public Leitor getUsuario() {
        return usuario;
    }

    public void setUsuario(Leitor usuario) {
        this.usuario = usuario;
    }

    public Livro getObra() {
        return obra;
    }

    public void setObra(Livro obra) {
        this.obra = obra;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        StringBuilder resumo = new StringBuilder();
        resumo.append(">> COMPROVANTE DE EMPRÉSTIMO <<\n");
        resumo.append("Retirada: ").append(dataSaida.format(dtf)).append("\n");
        resumo.append("Prazo Final: ").append(prazoEntrega.format(dtf)).append("\n");
        resumo.append("Usuário: ").append(usuario).append("\n");
        resumo.append("Item: ").append(obra);

        return resumo.toString();
    }
}