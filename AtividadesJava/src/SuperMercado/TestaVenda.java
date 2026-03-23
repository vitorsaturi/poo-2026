package SuperMercado;

public class TestaVenda {
    public static void main(String[] args) {
        Produto mercadoriaA = new Produto(101, "Azeite de Oliva", 38.50);
        Produto mercadoriaB = new Produto(102, "Café Gourmet", 22.90);

        Cliente pessoaFisica = new Cliente(500, "Marcos Silva");

        Venda operacaoCaca = new Venda();
        operacaoCaca.setCliente(pessoaFisica);

        operacaoCaca.adicionarItem(1, 3, mercadoriaA);
        operacaoCaca.adicionarItem(2, 2, mercadoriaB);

        System.out.println(operacaoCaca.toString());
    }
}