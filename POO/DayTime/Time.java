package DayTime;

public class Time {
    private int horas;

    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
        public void dia(){
            if(horas >= 5 && horas <= 10)
                System.out.println("Bom Dia!");
            else if(horas > 10 && horas < 18)
                System.out.println("Boa Tarde!");
            else
                System.out.println("Boa Noite!");
}
}
