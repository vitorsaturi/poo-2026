package SuperMercado;

import java.util.ArrayList;

public class Venda {
    private Cliente titular;
    private ArrayList<ItemVenda> carrinho;

    public Venda() {
        this.carrinho = new ArrayList<>();
    }

    public void setCliente(Cliente titular) {
        this.titular = titular;
    }

    // Regra: Criando o objeto internamente a partir de tipos primitivos (Composição)
    public void adicionarItem(int id, int qtd, Produto p) {
        ItemVenda novaLinha = new ItemVenda(id, qtd, p);
        carrinho.add(novaLinha);
    }

    @Override
    public String toString() {
        StringBuilder cupom = new StringBuilder();
        cupom.append("======= CUPOM FISCAL =======\n")
                .append(titular).append("\n")
                .append("----------------------------\n");

        for (ItemVenda linha : carrinho) {
            cupom.append(linha).append("\n");
        }

        cupom.append("============================");
        return cupom.toString();
    }
}