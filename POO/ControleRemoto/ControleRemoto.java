package ControleRemoto;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado, tocando;

    public ControleRemoto() {
        this.volume = 10;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    @Override
    public void ligar(){
        if(!getLigado())
            this.setLigado(true);
        else
            System.out.println("Impossível executar essa operação pois já está ligada!");
    }
    @Override
    public void desligar(){
        if(getLigado())
            this.setLigado(false);
        else
            System.out.println("Impossível executar essa operação pois já está desligada!");
    }
    @Override
    public void abrirMenu(){
        System.out.println("\n--- MENU ---");
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Volume:" + this.getVolume());
        System.out.println("Está tocando? " + this.getTocando() + "\n");

    }
    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume(){
        if(this.getLigado() && this.getVolume() < 100)
            this.setVolume(this.getVolume() + 5);
        else
            System.out.println("Impossível aumentar o volume.");
    }
    @Override
    public void menosVolume(){
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(this.getVolume() - 5);
        else
            System.out.println("Impossível abaixar o volume pois já está mudo.");
    }
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(0);
        else
            System.out.println("Impossível executar essa ação pois já está mudo.");
    }
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0)
            this.setVolume(10);
    }
    @Override
    public void play(){
        if(this.getLigado() && !this.getTocando())
            this.setTocando(true);
        else
            System.out.println("Impossível executar essa operação pois já está tocando.");
    }
    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando())
            this.setTocando(false);
        else
            System.out.println("Impossível executar essa operação pois já está pausado.");
    }
}
