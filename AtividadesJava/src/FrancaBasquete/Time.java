package FrancaBasquete;

import java.util.ArrayList;

public class Time {
    private int registroClube;
    private String nomeEquipe;
    private String comandante;
    private ArrayList<Atleta> elenco;

    public Time() {
        elenco = new ArrayList<>();
    }

    public Time(int registroClube, String nomeEquipe, String comandante) {
        this.registroClube = registroClube;
        this.nomeEquipe = nomeEquipe;
        this.comandante = comandante;
        this.elenco = new ArrayList<>();
    }

    public void contratarAtleta(Atleta novoAtleta) {
        elenco.add(novoAtleta);
    }

    @Override
    public String toString() {
        String listaDeJogadores = "";

        for (Atleta j : elenco) {
            listaDeJogadores += "-> " + j.getNomeJogador() + " (" + j.getFuncaoQuadra() + ")\n";
        }

        String saida = "### INFORMAÇÕES DA EQUIPE ###\n";
        saida += "Time: " + nomeEquipe + "\n";
        saida += "Treinador: " + comandante + "\n";
        saida += "Plantão de Atletas:\n" + listaDeJogadores;

        return saida;
    }
}