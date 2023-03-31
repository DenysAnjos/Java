package Humano2;

public class Application {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Gabriel", "M", 21);
        Aluno a1 = new Aluno("Chris", "M", 20, true, "ADS");
        Bolsista b1 = new Bolsista("Niedson", "M", 23, true, "História", 3413);
        a1.pagarMensal();
        b1.pagarMensal();
    }
}
