package ProjetoYoutube;

public class Application {
    public static void main(String[] args) {
        User[] u = new User[2];
        u[0] = new User("Denys", "M", 23, "Abacaxi");
        u[1] = new User("Cleber", "M", 23, "Maça");
        Video[] v = new Video[2];
        v[0] = new Video("Aula 14a de POO");
        v[1] = new Video("Aula 14b de POO");
        Preview p[] = new Preview[2];
        p[0] = new Preview(u[1], v[0]);
        p[1] = new Preview(u[0], v[0]);
        p[0].rate(10);
        p[0].rate(5);
        System.out.println(v[0].getRate());


    }
}
