package Heranca;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] equipe = new Desenvolvedor[4];

        equipe[0] = new Junior("Carlos Silva", "Alice", "Java", 3500.0f);
        equipe[1] = new Pleno("Bob", "Python", 6500.0f, 12); // 12 projetos entregues
        equipe[2] = new Senior("Carol", "C#", 12000.0f, 2500.0f); // 2500 de verba
        equipe[3] = new Desenvolvedor("Dave", "PHP", 3000.0f);

        System.out.println("=== RELATÓRIO DE DESENVOLVEDORES ===\n");

        for (Desenvolvedor dev : equipe) {

            dev.codar();

            System.out.println("Bônus calculado: R$ " + dev.calculaBonus());

            System.out.println("Detalhes: " + dev.toString());
        }
    }
}