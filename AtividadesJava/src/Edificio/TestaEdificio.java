package Edificio;

public class TestaEdificio {
    public static void main(String[] args) {
        Edificio objEdificio = new Edificio("Residencial Castelo", "Rua da Esperança, 2044");

        objEdificio.construirApartamento(123, 3);
        objEdificio.construirApartamento(124, 3);
        objEdificio.construirApartamento(125, 3);

        System.out.println(objEdificio.toString());
    }
}