package UltraEmojiCombat;

public class Lutador{
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    public Lutador(String no, String na, int id, int vi, int de, int em, double al, double pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.setPeso(pe);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(){
        if (this.getPeso() > 55 && this.getPeso() < 70)
            this.categoria = "Peso Leve";
        else if (this.getPeso() >= 70 && this.getPeso() <= 80) {
            this.categoria = "Peso Médio";
        }
        else if(this.getPeso() > 80 && this.getPeso() < 110)
            this.categoria = "Peso Pesado";
        else
            this.categoria = "Peso inválido";
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }
    public void apresentar(){
        System.out.println("Lutador: " + getNome() + ", " + getIdade() + " anos com " + getAltura()
                + "m\n" + "Nacionalidade: " + getNacionalidade() + "\nVitórias: " + getVitorias() +
                "  Derrotas: " + getDerrotas() + "  Empates:" + getEmpates());
    }
    public void status(){
        System.out.println(getNome() + " é um " + getCategoria() + " e possui:\n" +
                "Vitórias: " + getVitorias() + "     Derrotas: " + getDerrotas() + "     Empates:" + getEmpates());

    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
