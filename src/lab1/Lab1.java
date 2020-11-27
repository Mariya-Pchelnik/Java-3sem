package lab1;

import java.sql.SQLOutput;
    public  class Lab1 {
        public static void main(String[] args) {
            Person person1 = new Person();
            Person person2 = new Person();
            person1.setSex("man");
            person1.setAge(14);
            person1.setSurname("Petrov");
            person1.print();
            person2.setSex("women");
            person2.setSurname("Ivanova");
            person2.setAge(30);
            person2.print();


            System.out.print("/n Количество мужчин: ");
            System.out.println(person2.ManNumber() + person1.ManNumber());
            System.out.print("Средний возраст: ");
            System.out.println((person1.getAge() + person2.getAge()) / 2);
        }
    }



