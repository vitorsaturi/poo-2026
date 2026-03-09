public class TesteAr {
    public static void main(String[] args) {
        Ac obj1 = new Ac("Samsung", "abc", 22);
        System.out.println(obj1.toString());
        obj1.setTemperatura(10);
        System.out.println(obj1.toString());
        obj1.setTemperatura(25);
        System.out.println(obj1.toString());
        obj1.modoTurbo();
        obj1.ligar();
        obj1.modoTurbo();
        System.out.println(obj1.toString());
    }
}