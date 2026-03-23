package SuperMercado;

public class Produto {
    private int sku;
    private String descricao;
    private double valorUnitario;

    public Produto() {}

    public Produto(int sku, String descricao, double valorUnitario) {
        this.sku = sku;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return String.format("%s (Preço: R$ %.2f)", descricao, valorUnitario);
    }
}