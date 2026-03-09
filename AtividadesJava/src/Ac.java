public class Ac {

    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public Ac() {
        this.marca = "Genérico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    public Ac(String marca, String modelo, int temperatura){
        this.marca = marca;
        this.modelo = modelo;
        setTemperatura(temperatura);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura){
            if (temperatura >= 16 && temperatura <= 30) {
                this.temperatura = temperatura;
            }
        else{
            System.out.println("Temperatura inválida");
        }
    }
    public boolean ligado() {
        return ligado;
    }
    public void ligar() {
        if(!ligado) {
            this.ligado = true;
            System.out.println("O ar condicionado " + marca + " foi ligado.");
        }
    }

    public void desligar() {
        if(ligado) {
            this.ligado = false;
            System.out.println("O ar condicionado foi desligado.");
        }
    }
    public void ajustarTemp(int novaTemp){
        if(ligado){
            setTemperatura(novaTemp);
        }
        else{
            System.out.println("Ligue o ar antes de ajustar a temperatura! ");
        }
    }
    public void modoTurbo(){
        if(this.ligado){
            System.out.println("Modo turbo ativo! ");
            ResfriamentoRapido();
        }
        else{
            System.out.println("Ligue o ar antes de ligar o modo turbo! ");
        }
    }
    private void ResfriamentoRapido(){
        System.out.println("Modo turbo ativo! ");
        System.out.println("Aumentando rotação do compressor ");
        System.out.println("Ligando ventilação máxima ");
        this.setTemperatura(16);
    }
    public String toString(){
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Temperatura: " + this.temperatura +
                " Status " +(this.ligado ? "Ligado" : "Desligado");
    }
}

