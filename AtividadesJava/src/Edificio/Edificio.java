package Edificio;

import java.util.ArrayList;

public class Edificio {
    private String denominacao;
    private String localizacao;
    private ArrayList<Apartamento> listaDeUnidades;

    public Edificio(String denominacao, String localizacao) {
        this.denominacao = denominacao;
        this.localizacao = localizacao;
        this.listaDeUnidades = new ArrayList<>();
    }

    // Regra: Criando o objeto internamente a partir de tipos primitivos
    public void construirApartamento(int num, int andar) {
        // Criação interna conforme a regra
        Apartamento novoAp = new Apartamento(num, andar);
        listaDeUnidades.add(novoAp);
    }

    @Override
    public String toString() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append(">>> DETALHES DO EMPREENDIMENTO <<<\n")
                .append("Nome: ").append(denominacao)
                .append("\nEndereço: ").append(localizacao)
                .append("\nListagem de Moradias:\n");

        for (Apartamento item : listaDeUnidades) {
            relatorio.append(" -> ").append(item).append("\n");
        }
        return relatorio.toString();
    }
}