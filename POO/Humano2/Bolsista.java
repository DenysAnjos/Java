package Humano2;

public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){

    }
    @Override
    public void pagarMensal(){
        System.out.println("Valor a pagar: RS150");
        System.out.printf("Bolsa de %s paga com sucesso!\n", getNome());
    }

    public Bolsista(String nome, String sexo, int idade, boolean matr, String curso, int bolsa) {
        super(nome, sexo, idade, matr, curso);
        this.bolsa = bolsa;
    }

    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}

