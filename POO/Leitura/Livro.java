package Leitura;

public class Livro implements Publicacao{
    private Pessoa leitor;
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, int totPag,  Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
    }
    public String detalhes() {
        return "Titulo:" + titulo +
                "     Autor:" + autor +
                "\nTotal de páginas:" + totPag +
                "     Página atual:" + pagAtual +
                "     Aberto?" + aberto +
                "\nLeitor:" + leitor.getNome() +
                "     Idade:" + leitor.getIdade() +
                "     Sexo:" + leitor.getSexo() + "\n";
    }
    @Override
    public void abrir() {
        if(aberto)
            System.out.println("O livro já está aberto!");
        else
            aberto = true;
    }
    @Override
    public void fechar() {
        if(!aberto)
            System.out.println("O livro já está fechado!");
        else
            aberto = false;
    }
    @Override
    public void folhear(int p) {
        if(aberto)
            if(p < totPag)
                this.setPagAtual(p);
            else
                System.out.println("Essa página não existe.");
        else
            System.out.println("O livro está fechado.");
    }
    @Override
    public void avancarPag() {
        if(aberto)
            if(getPagAtual() < totPag)
                setPagAtual(getPagAtual() + 1);
            else
                System.out.println("Essa página não existe.");
        else
            System.out.println("O livro está fechado");
    }
    @Override
    public void voltarPag() {
        if(aberto)
            if(getPagAtual() > 0)
                setPagAtual(getPagAtual() - 1);
            else
                System.out.println("Essa página não existe!");
        else
            System.out.println("O livro está fechado");
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
