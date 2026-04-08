package Interface;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura{

    private boolean ligado = false;
    private double temperaturaAtual = 22.5;

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (this.ligado) {
            return this.temperaturaAtual;
        } else {
            System.out.println("Dispositivo desligado. Não é possível ler a temperatura.");
            return 0.0;
        }
    }
}
