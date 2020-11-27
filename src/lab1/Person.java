package lab1;

public class Person  {
    private String surname;
    private String sex;
    private int age;
    String m = "man";
    int r = 0;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int ManNumber() {
        if (sex.equals(m)) r++;
        return r;

    }

    public void print()

    {
        System.out.println("\n"+"Фамилия " + surname);
        System.out.println("Пол "+sex);
        System.out.println("Возраст "+age);
    }

}

