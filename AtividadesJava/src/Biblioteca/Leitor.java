package Biblioteca;

public class Leitor {
    private int matricula;
    private String nomeCompleto;

    public Leitor() {
    }

    public Leitor(int matricula, String nomeCompleto) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public String toString() {
        String info = "CADASTRO DO USUÁRIO\n";
        info += "Nº Matrícula: " + matricula + "\n";
        info += "Nome: " + nomeCompleto;
        return info;
    }
}