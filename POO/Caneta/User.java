package Caneta;

public class User {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        c1.ponta = 0.5;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.carga = 1;
        c1.status();
        c1.rabiscar();

    }
}
