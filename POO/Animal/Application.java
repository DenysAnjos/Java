package Animal;

public class Application {
    public static void main(String[] args) {
        Arara a = new Arara();
        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        c.emitirSom();
        c.locomover();
        k.emitirSom();
        k.locomover();
        a.fazerNinho();
        a.locomover();
        a.emitirSom();
    }
}
