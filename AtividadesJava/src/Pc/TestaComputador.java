package Pc;

public class TestaComputador {

    public static void exibirInventario(Computador[] listaEquipamentos) {
        System.out.println(">>> RELATÓRIO DE HARDWARE DO PROJETO <<<");
        for (Computador maq : listaEquipamentos) {
            if (maq != null) {
                System.out.println(maq);
            }
        }
    }
    public static void main(String[] args) {
        Processador unidade1 = new Processador("Amd", "Ryzen 7 7700", 3.8);
        Computador desktop1 = new Computador(1001, "Dell", unidade1);
        Computador[] inventario = { desktop1 };
        exibirInventario(inventario);
    }
}