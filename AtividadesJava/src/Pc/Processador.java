package Pc;

public class Processador {
    private String marcaChip;
    private String versao;
    private double clock;

    public Processador() {}

    public Processador(String marcaChip, String versao, double clock) {
        this.marcaChip = marcaChip;
        this.versao = versao;
        this.clock = clock;
    }

    @Override
    public String toString() {
        return "Chipset: " + marcaChip +
                " (Mod: " + versao + ")" +
                " @ " + clock + "GHz";
    }
}