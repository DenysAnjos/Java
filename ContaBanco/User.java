package ContaBanco;

public class User {
    public static void main(String[] args) {
        ContaTerminal u1 = new ContaTerminal();
        u1.abrirConta("CC");
        u1.setDono("Denys Anjos");
        u1.depositar(100);
        u1.sacar(150);
        u1.fecharConta();
        u1.fecharConta();
        u1.depositar(100);
        u1.sacar(100);
    }
}
