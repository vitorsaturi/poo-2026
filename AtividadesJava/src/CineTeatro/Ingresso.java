package CineTeatro;

public class Ingresso {
    private int nroBilhete;
    private String poltrona;
    private String modalidade; // Ex: Inteira/Meia
    private float valorPago;

    public Ingresso(int nroBilhete, String poltrona, String modalidade, float valorPago) {
        this.nroBilhete = nroBilhete;
        this.poltrona = poltrona;
        this.modalidade = modalidade;
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "TICKET #" + nroBilhete + " | Assento: " + poltrona +
                " | Tipo: " + modalidade + " | R$ " + String.format("%.2f", valorPago);
    }
}