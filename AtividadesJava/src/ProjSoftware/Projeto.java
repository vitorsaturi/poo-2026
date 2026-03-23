package ProjSoftware;

import java.util.ArrayList;

public class Projeto {
    int idRef;
    String titulo;
    ArrayList<Programador> time = new ArrayList<>();

    public void registrarMembro(Programador dev) {
        time.add(dev);
    }

    public void exibirEquipeAlocada() {
        System.out.println("--- Listando membros do projeto: " + (titulo != null ? titulo : "Geral") + " ---");
        for (Programador integrante : time) {
            System.out.println(integrante);
        }
    }
}