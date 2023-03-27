package UltraEmojiCombat;

import java.util.Random;
public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada!!!");
        }
        else {
            aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(){
        if(aprovada){
            System.out.println("\n-----Desafiado-----");
            this.desafiado.apresentar();
            System.out.println("\n-----Desafiante-----");
            this.desafiante.apresentar();
            Random r = new Random();
            int vencedor = r.nextInt(3);

            switch (vencedor) {
                case 0 -> {
                    System.out.println("\nEmpate!!!");
                    this.desafiante.setEmpates(desafiante.getEmpates() + 1);
                    this.desafiado.setEmpates(desafiado.getEmpates() + 1);
                }
                case 1 -> {
                    System.out.println("\n" + desafiado.getNome() + " é o grande vencedor");
                    this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                    this.desafiante.setDerrotas(this.desafiante.getDerrotas() + 1);
                }
                case 2 -> {
                    System.out.println("\n" + desafiante.getNome() + " é o grande vencedor");
                    this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                    this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
                }
            }
        }
        else
            System.out.println("Luta não aprovada.");
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
