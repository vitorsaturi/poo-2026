package SuperMercado;

public class Cliente {
    private int registro;
    private String nomeUsuario;

    public Cliente(int registro, String nomeUsuario) {
        this.registro = registro;
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public String toString() {
        return String.format("Comprador: %s [#%d]", nomeUsuario, registro);
    }
}