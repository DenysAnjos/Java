package Bank;

public class Account {
    private int number;
    private String name, initial;
    private float value;

    public void deposit(float value){
        this.setValue(this.getValue() + value);
    }
    public void withdraw(float value){
        this.setValue(this.getValue() - value - 5);
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public String getInitial() {
        return initial;
    }
    public void setInitial(String initial) {
        this.initial = initial;
    }

    @Override
    public String toString() {
        return "Account: " + number +
                ", Holder: " + name +
                ", Balance: $" + value;
    }
}

