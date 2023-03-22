package Caneta;

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }
    public void rabiscar(){
        if(this.tampada == false && this.carga > 0) {
            System.out.println("Estou rabiscando.\n");
        }
        else
            System.out.println("Não posso rabiscar.\n");
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
