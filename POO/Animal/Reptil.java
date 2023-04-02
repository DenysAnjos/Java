package Animal;

public class Reptil extends Animal{

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Estou rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Estou Comendo vegetais!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Estou fazendo som!");
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
