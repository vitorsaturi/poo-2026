package FrancaBasquete;

public class TestaTime {
    public static void main(String[] args) {
        Atleta AlaPivo = new Atleta(999, "Lucas Dias", "Ala/Pivo");
        Time SesiF = new Time(1, "Franca", "Helinho");
        SesiF.contratarAtleta(AlaPivo);
        System.out.println(SesiF);
    }
}
