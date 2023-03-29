package Leitura;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        p[0] = new Pessoa("Denys", "M", 23);
        p[1] = new Pessoa("Marli", "F", 62);
        l[0] = new Livro("Scrum", "Jeff Sutherland", 259, p[0]);
        l[1] = new Livro("Java SE 8", "Guilherme Silveira", 477, p[0]);
        l[2] = new Livro("O Anticristo", "Friedrich Nietzsche", 105,  p[1]);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        p[0].fazerNiver();
        System.out.println(p[0].getIdade());
        l[2].folhear(9);
        l[2].abrir();
        l[2].folhear(9);
        System.out.println(l[2].getPagAtual());
        l[2].folhear(500);
    }
}
