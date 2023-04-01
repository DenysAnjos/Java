package Animal;

public final class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Estou latindo!");
    }

    public final void esterrarOsso(){
        System.out.println("Estou enterrando o osso!");
    }
    public final void abanarRabo(){
        System.out.println("Estou abanando o rabo!");
    }
}
