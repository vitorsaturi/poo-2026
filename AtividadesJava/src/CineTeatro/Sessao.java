package CineTeatro;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int idExibicao;
    private LocalDateTime dataHora;
    private int numSala;
    private Filme obraEmCartaz; // Agregação
    private ArrayList<Ingresso> listaVendas; // Composição

    public Sessao(int idExibicao, LocalDateTime dataHora, int numSala) {
        this.idExibicao = idExibicao;
        this.dataHora = dataHora;
        this.numSala = numSala;
        this.listaVendas = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.obraEmCartaz = f;
    }

    // Regra: Criando o ingresso internamente (Composição)
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novoTicket = new Ingresso(id, assento, tipo, preco);
        listaVendas.add(novoTicket);
    }

    @Override
    public String toString() {
        StringBuilder sumario = new StringBuilder();
        sumario.append("========== BORDERÔ DE SESSÃO ==========\n")
                .append("ID SESSÃO: ").append(idExibicao)
                .append(" | SALA: ").append(numSala)
                .append("\nDATA/HORA: ").append(dataHora)
                .append("\nOBRA: ").append(obraEmCartaz)
                .append("\n--- RELAÇÃO DE VENDAS ---\n");

        for (Ingresso tkt : listaVendas) {
            sumario.append(tkt).append("\n");
        }
        return sumario.toString();
    }
}