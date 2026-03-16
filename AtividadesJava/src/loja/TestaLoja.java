package loja;

public class TestaLoja {
    public static void main(String[] args) {

        Produtos p1 = new Produtos(1, "Mouse", 120.0);
        Produtos p2 = new Produtos(2, "Teclado", 250.0);
        Produtos p3 = new Produtos(3, "Monitor", 900.0);

        Carrinho meuCarrinho = new Carrinho("E-Tech Store");

        meuCarrinho.adicionarProduto(p2);
        meuCarrinho.adicionarProduto(p3);

        meuCarrinho.gerarItem(101, 2, 120.0f);
        meuCarrinho.gerarItem(102, 1, 900.0f);

        System.out.println(meuCarrinho.toString());
        meuCarrinho.removerItem(101);
        System.out.println(meuCarrinho.toString());
    }
}