package Heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        FilhaAviao meuAviao = new FilhaAviao("Embraer", "E195", 850.0f, 12000.0f);
        CarroEletrico meuCarro = new CarroEletrico("BYD", "Seal", 180.0f, 500);

        PaiVeiculo veiculoGenerico;

        veiculoGenerico = meuAviao;
        System.out.print("[Referência Avião]: ");
        veiculoGenerico.mover();

        veiculoGenerico = meuCarro;
        System.out.print("[Referência Carro]: ");
        veiculoGenerico.mover();

        System.out.println(meuAviao.toString());
        System.out.println(meuCarro.toString());
    }
}
