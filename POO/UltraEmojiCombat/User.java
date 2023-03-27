package UltraEmojiCombat;

public class User {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Denys", "Brasileiro", 23, 3, 1, 1, 1.76, 80);
        l[1] = new Lutador("Bernado", "Brasileiro", 18, 0, 1, 1, 1.72, 98);
        l[2] = new Lutador("Jordan", "Americano", 24, 1, 1 , 0, 1.83, 68);
        l[3] = new Lutador("Enoq", "Alemão", 20, 1, 0, 2, 1.75, 59);
        Luta UEC = new Luta();
        UEC.marcarLuta(l[2], l[3]);
        UEC.lutar();


    }
}
