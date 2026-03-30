package Heranca;

public class FilhaAviao extends PaiVeiculo {
    private float altitudeMax;

    public FilhaAviao() {}

    public FilhaAviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() { return altitudeMax; }
    public void setAltitudeMax(float altitudeMax) { this.altitudeMax = altitudeMax; }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeMax + " metros.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação.");
    }
}

