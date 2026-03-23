package ClinicaMedica;

public class Medico {
    private String nomeCompleto;
    private int registro;
    private String areaAtuacao;

    public Medico() {
    }

    public Medico(String nomeCompleto, int registro, String areaAtuacao) {
        this.nomeCompleto = nomeCompleto;
        this.registro = registro;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        String dados = "DADOS DO PROFISSIONAL\n";
        dados += "Nome: " + nomeCompleto + "\n";
        dados += "CRM: " + registro + "\n";
        dados += "Especialidade: " + areaAtuacao;
        return dados;
    }
}