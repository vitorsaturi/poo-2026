package loja;
import java.util.ArrayList;

public class Carrinho {
    private String nomeLoja;
    private ArrayList<Produtos> listaProdutos; // Agregação
    private ArrayList<VendaProduto> listaItens;   // Composição

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.listaProdutos = new ArrayList<>();
        this.listaItens = new ArrayList<>();
    }

    // Parte 1: Agregação (Recebe o objeto Produto pronto)
    public void adicionarProduto(Produtos p) {
        this.listaProdutos.add(p);
    }

    // Parte 2: Composição (Cria o objeto ItemVenda aqui dentro)
    public void gerarItem(int id, int qtd, float valor) {
        VendaProduto novoItem = new VendaProduto(id, qtd, valor);
        this.listaItens.add(novoItem);
    }

    public void removerItem(int id) {
        this.listaItens.removeIf(item -> item.getId() == id);
    }

    @Override
    public String toString() {
        return "LOJA: " + nomeLoja +
                "\n--- Produtos ---" + listaProdutos +
                "\n--- Itens ---" + listaItens;
    }
}