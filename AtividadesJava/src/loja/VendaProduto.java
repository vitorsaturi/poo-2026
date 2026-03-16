package loja;

public class VendaProduto {
    private int id;
    private int quantidade;
    private float valorUnitario;

    public VendaProduto(int id, int quantidade, float valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "\nVendaProduto" + "id=" + id + ", qtd=" + quantidade + ", valor=" + valorUnitario;
    }
}