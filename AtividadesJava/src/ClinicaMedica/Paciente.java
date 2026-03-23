package ClinicaMedica;

public class Paciente {
    private int prontuario;
    private String nomeUsuario;
    private String documentoCpf;

    public Paciente() {
    }

    public Paciente(int prontuario, String nomeUsuario, String documentoCpf) {
        this.prontuario = prontuario;
        this.nomeUsuario = nomeUsuario;
        this.documentoCpf = documentoCpf;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDocumentoCpf() {
        return documentoCpf;
    }

    public void setDocumentoCpf(String documentoCpf) {
        this.documentoCpf = documentoCpf;
    }

    @Override
    public String toString() {
        String resumo = "IDENTIFICAÇÃO DO PACIENTE\n";
        resumo += "Nome: " + nomeUsuario + "\n";
        resumo += "CPF: " + documentoCpf + "\n";
        resumo += "Prontuário: " + prontuario;
        return resumo;
    }
}