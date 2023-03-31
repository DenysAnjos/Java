package Humano2;

public class Aluno extends Pessoa{
    private boolean matr;
    private String curso;

    public void pagarMensal(){
        System.out.println("Valor a pagar: R$100");
        System.out.printf("Mensalidade de %s paga com sucesso!\n", getNome());
    }

    public Aluno(String nome, String sexo, int idade, boolean matr, String curso) {
        super(nome, sexo, idade);
        this.matr = matr;
        this.curso = curso;
    }

    public boolean isMatr() {
        return matr;
    }
    public void setMatr(boolean matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
