package ProjetoYoutube;

public class User extends Person{
    private String login;
    private int totViewers;

    public User(String name, String sex, int age, String login) {
        super(name, sex, age);
        this.login = login;
    }

    public void vieMoreOne(){
        totViewers++;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotViewers() {
        return totViewers;
    }
    public void setTotViewers(int totViewers) {
        this.totViewers = totViewers;
    }
}
