package ProjetoYoutube;

public abstract class Person {
    protected String name, sex;
    protected int age, experience;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.experience = 0;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                "   Sex: " + sex +
                "\nAge: " + age +
                "       Experience: " + experience + "\n";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
