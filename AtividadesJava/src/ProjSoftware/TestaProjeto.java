package ProjSoftware;

public class TestaProjeto {
    public static void main(String[] args) {
        Programador dev1 = new Programador(46, "Gilbertou Souza", "Rust");
        Programador dev2 = new Programador(47, "Julia Duarte", "Typescript");
        Projeto instanciaProjeto = new Projeto();
        instanciaProjeto.titulo = "Sistema de Vistoria";
        instanciaProjeto.registrarMembro(dev1);
        instanciaProjeto.registrarMembro(dev2);
        instanciaProjeto.exibirEquipeAlocada();
    }
}