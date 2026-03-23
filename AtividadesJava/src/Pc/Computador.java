package Pc;

public class Computador {
    private int serialNo;
    private String fabricante;
    private Processador cpu;

    public Computador() {}

    public Computador(int serialNo, String fabricante, Processador cpu) {
        this.serialNo = serialNo;
        this.fabricante = fabricante;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "=== ESPECIFICAÇÕES DO EQUIPAMENTO ===\n" +
                "Série: " + serialNo +
                "\nVendor: " + fabricante +
                "\nUnidade Central: " + cpu;
    }
}