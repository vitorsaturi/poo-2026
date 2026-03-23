package FrancaBasquete;

public class Atleta {
    private int registroFiba;
    private String nomeJogador;
    private String funcaoQuadra;

    public Atleta() {
    }

    public Atleta(int registroFiba, String nomeJogador, String funcaoQuadra) {
        this.registroFiba = registroFiba;
        this.nomeJogador = nomeJogador;
        this.funcaoQuadra = funcaoQuadra;
    }

    public int getRegistroFiba() {
        return registroFiba;
    }

    public void setRegistroFiba(int registroFiba) {
        this.registroFiba = registroFiba;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getFuncaoQuadra() {
        return funcaoQuadra;
    }

    public void setFuncaoQuadra(String funcaoQuadra) {
        this.funcaoQuadra = funcaoQuadra;
    }

    @Override
    public String toString() {
        String ficha = "--- FICHA TÉCNICA DO ATLETA ---\n";
        ficha += "Nome do Jogador: " + nomeJogador + "\n";
        ficha += "Função em Quadra: " + funcaoQuadra + "\n";
        ficha += "ID Registro: " + registroFiba;
        return ficha;
    }
}