package Humano;

public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;

    public void cancelarMatr(){
            matr = false;
    }

    public Aluno(String nome, String sexo, int idade, boolean matr, String curso) {
        super(nome, sexo, idade);
        this.matr = matr;
        this.curso = curso;
    }
    public boolean getMatr() {
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
