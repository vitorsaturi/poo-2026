package Edificio;

public class Apartamento {
    private int codigoUnidade;
    private int nivel;

    public Apartamento(int codigoUnidade, int nivel) {
        this.codigoUnidade = codigoUnidade;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        // Estilo de retorno mudado para uma linha única formatada
        return String.format("Unidade: %d | Pavimento: %dº", codigoUnidade, nivel);
    }
}