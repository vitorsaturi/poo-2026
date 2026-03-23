package SuperMercado;

public class ItemVenda {
    private int nroSequencial;
    private int volume;
    private Produto itemRef;

    public ItemVenda(int nroSequencial, int volume, Produto itemRef) {
        this.nroSequencial = nroSequencial;
        this.volume = volume;
        this.itemRef = itemRef;
    }

    @Override
    public String toString() {
        return "[Item " + nroSequencial + "] " + itemRef + " | Qtd: " + volume;
    }
}