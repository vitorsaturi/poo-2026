package CineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme longaMetragemA = new Filme(990, "O Poderoso Chefão", "Drama/Crime", 175);
        Filme longaMetragemB = new Filme(991, "Interestelar", "Ficção Científica", 169);

        Sessao exibicaoEspecial = new Sessao(800, LocalDateTime.of(2026, 12, 25, 16, 30), 5);

        exibicaoEspecial.vincularFilme(longaMetragemB);

        exibicaoEspecial.venderIngresso(50, "B12", "Inteira", 45.0f);
        exibicaoEspecial.venderIngresso(51, "B13", "Inteira", 45.0f);
        exibicaoEspecial.venderIngresso(52, "C01", "Meia", 22.5f);

        System.out.println(exibicaoEspecial.toString());
    }
}