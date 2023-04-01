package Animal;

public class Ave extends Animal{

    private String corPena;

    public void fazerNinho(){
        System.out.println("Estou fazendo meu ninho!");
    }

    @Override
    public void locomover() {
        System.out.println("Estou voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Estou bicando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Estou cantando!");
    }

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
