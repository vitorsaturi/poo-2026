package ProjSoftware;

public class Programador {
    int codigo;
    String nomeCompleto;
    String stackPrincipal;

    public Programador(int codigo, String nomeCompleto, String stackPrincipal) {
        this.codigo = codigo;
        this.nomeCompleto = nomeCompleto;
        this.stackPrincipal = stackPrincipal;
    }

    @Override
    public String toString() {
        return "Matrícula: " + codigo +
                "\nColaborador: " + nomeCompleto +
                "\nTecnologia: " + stackPrincipal + "\n";
    }
}