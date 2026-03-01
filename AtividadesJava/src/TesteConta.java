public class TesteConta {
    public static void main(String[] args){
        Conta obj1 = new Conta("João Silva", 4000,  12345);
        obj1.depositar(500);
        obj1.sacar(200);
        System.out.println(obj1.toString());
        obj1.encerrar();
        obj1.sacar(300);
        obj1.encerrar();
        System.out.println(obj1.toString());


        Conta obj2 = new Conta("Maria Souza", 1111, 54321);
        obj2.sacar(50);
    }
}
