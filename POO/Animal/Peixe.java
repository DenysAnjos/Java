package Animal;

public class Peixe extends Animal{

    private String corEscama;

    public void soltarBolha(){
        System.out.println("Estou soltando bolha!");
    }

    @Override
    public void locomover() {
        System.out.println("Estou nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Estou fisgando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!");
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
