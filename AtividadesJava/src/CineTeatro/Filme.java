package CineTeatro;

public class Filme {
    private int codObra;
    private String nomeOriginal;
    private String categoria;
    private int tempoMinutos;

    public Filme(int codObra, String nomeOriginal, String categoria, int tempoMinutos) {
        this.codObra = codObra;
        this.nomeOriginal = nomeOriginal;
        this.categoria = categoria;
        this.tempoMinutos = tempoMinutos;
    }

    @Override
    public String toString() {
        return String.format("%s [%s] - Duração: %dh%02d",
                nomeOriginal, categoria, tempoMinutos / 60, tempoMinutos % 60);
    }
}