package Animal;

public class Mamifero extends Animal{

    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Estou correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Estou mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero!");
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
