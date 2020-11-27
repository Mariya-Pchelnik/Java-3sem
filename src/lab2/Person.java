package lab2;

public class Person {
    private String surname;
    private String sex;
    private int age;

    public Person() {

    }

    public Person(String surname, String sex, int age) {
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public Person(Person o) {
        this.surname = o.surname;
        this.sex = o.sex;
        this.age = o.age;
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

    public void print() {
        System.out.println("\n" + "Фамилия " + surname);
        System.out.println("Пол " + sex);
        System.out.println("Возраст " + age);
    }

    public static int ManNumber(Person person[]) {
        int r = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSex()!=null){
            if (person[i].getSex().equals("man")) r++;
        }}

        return r;
    }
    public static int AverageAge(Person person[]){
        int sum=0;
        for(int i=0; i<person.length;i++){
             sum+=person[i].age;
        }
        return sum/(person.length-1);
    }

}
