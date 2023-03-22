package Caneta;

public class Main {
    public static void main(String[] args) {
        User c1 = new User();
        c1.modelo = "bic";
        c1.cor = "azul";;
        c1.ponta = 0.5;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
