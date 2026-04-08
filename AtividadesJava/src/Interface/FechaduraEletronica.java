package Interface;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel{

    private boolean Acesso = false;
    private String senhaC = "1234";


    @Override
    public void validarAcesso(String senha) {
        if(this.senhaC.equals(senha)){
            this.Acesso = true;
            System.out.println("Senha validada com sucesso! ");
        }else {
            this.Acesso = false;
            System.out.println("Senha incorreta, tente novamente! ");
        }

    }

    @Override
    public void ligar() {
        if (this.Acesso) {
            System.out.println("Fechadura destrancada");
        } else {
            System.out.println("Erro de autenticação ");
        }
    }

    @Override
    public void desligar() {
        System.out.println("Porta trancada!");
        this.Acesso = false;
        }
    }

