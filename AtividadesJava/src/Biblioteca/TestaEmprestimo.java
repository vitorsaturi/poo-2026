package Biblioteca;

public class TestaEmprestimo {
    public static void main(String[] args) {
        Leitor leitorOp = new Leitor(2167, "Ricardo Mendes");
        Livro exemplar = new Livro(4695, "O Alquimista", "Paulo Coelho");
        Emprestimo registro = new Emprestimo(leitorOp, exemplar);
        System.out.println(registro.toString());
    }
}