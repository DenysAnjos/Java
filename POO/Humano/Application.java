package Humano;

public class Application {
    public static void main(String[] args) {
        Professor pr1 = new Professor("Denys", "M", 23, "Java", 1000);
        Aluno a1 = new Aluno("Sarah", "F", 24, true, "Medicina");
        pr1.fazerAniv();
        System.out.println(pr1.toString());
        System.out.println(pr1.getEspecialidade());
        System.out.println(a1.getCurso());
    }
}
