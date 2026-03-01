public class Conta {
    //Variaveis
    public String nomeCliente;
    public float saldo;
    public int numeroConta, agencia;
    public boolean status;

    public void depositar(float x){
        if(status){
            this.saldo += x;
        }
        else{
            System.out.println(" Não foi possivel realizar o deposito pois a conta não esta ativa! ");
        }
    }

    public void sacar(float x){
        if(status && x <= saldo){
            this.saldo -= x;
            System.out.println("Saque no valor de " + x + " Foi realizado ");
        }
        else{
            System.out.println("Valor em conta insuficiente para o saque ");
        }
    }

    public void encerrar(){
        if(status && saldo == 0){
            status = false;
        }
        else{
            System.out.println("Para desativar a conta é necessario que todo saldo seja retirado! ");
        }
    }
    //Metodo construtor
    public Conta(String nomeCliente, int numeroConta, int agencia){
        this.nomeCliente = nomeCliente; this.saldo = saldo = 0; this.numeroConta = numeroConta;
        this.agencia = agencia; this.status = true;
    }
    public String toString(){
        return " Nome do cliente: " + nomeCliente +
                " Saldo do cliente: " + saldo +
                " Numero da conta: " + numeroConta +
                " Agência: " + agencia +
                " Status " +(this.status ? "Ativa" : "Inativa");
    }
}
