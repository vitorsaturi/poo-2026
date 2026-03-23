package Biblioteca;

public class Livro {
    private int codigoExemplar;
    private String nomeObra;
    private String responsavelEscrita;

    public Livro() {
    }

    public Livro(int codigoExemplar, String nomeObra, String responsavelEscrita) {
        this.codigoExemplar = codigoExemplar;
        this.nomeObra = nomeObra;
        this.responsavelEscrita = responsavelEscrita;
    }

    public int getCodigoExemplar() {
        return codigoExemplar;
    }

    public void setCodigoExemplar(int codigoExemplar) {
        this.codigoExemplar = codigoExemplar;
    }

    public String getNomeObra() {
        return nomeObra;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }

    public String getResponsavelEscrita() {
        return responsavelEscrita;
    }

    public void setResponsavelEscrita(String responsavelEscrita) {
        this.responsavelEscrita = responsavelEscrita;
    }

    @Override
    public String toString() {
        String dadosLivro = "DETALHES DO ACERVO\n";
        dadosLivro += "ID: " + codigoExemplar + "\n";
        dadosLivro += "Obra: " + nomeObra + "\n";
        dadosLivro += "Escrito por: " + responsavelEscrita;
        return dadosLivro;
    }
}