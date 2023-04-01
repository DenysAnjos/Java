package Animal;

public final class Canguru extends Mamifero{

    private String corPelo;

    @Override
    public final void locomover() {
        System.out.println("Estou pulando!");
    }
    public final void usarBolsa(){
        System.out.println("Estou usando a bolsa!");
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
