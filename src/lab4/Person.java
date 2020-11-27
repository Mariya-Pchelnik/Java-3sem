package lab4;

import java.io.*;


public class Person {
    private int counter = 0;
    private int sum;
    String surname;
    int age;
    boolean man;


    public Person() throws IOException {

        boolean rightSex;
        String sex;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));

        System.out.println("Введите фамилию");
        this.surname = input.readLine();
        System.out.println("Введите возраст");
        this.age = Integer.parseInt(input.readLine());

        while (true){
            System.out.println("Введите пол");
            sex = input.readLine();
            if (sex.equals("man")) {
                this.man = true;
                break;

            } else if (sex.equals("women")) {
                this.man = false;
                break;

            }
               else System.out.println("\nОшибка! Повторите ввод");


        }
    }

    public int AverageAgeCounter(Person[] array) {
        for (Person person : array) sum += person.age;
        return sum / array.length;
    }

    public int ManNumberCounter(Person[] array) {

        for (Person person : array)
            if (person.man) {
                counter++;
            }

        return counter;
    }

    //ввод информации в файл
    public void InputFile() throws IOException {
        File file = new File("document.txt");
        file.deleteOnExit();
        FileWriter writer = new FileWriter(file, true);
        writer.append("Фамилия " + this.surname + "; возраст: " + this.age);
        if (this.man) {
            writer.append("; пол: мужской\n");
        } else {
            writer.append("; пол: женский\n");
        }
        writer.flush();
        writer.close();
    }

    //ввод кол-ва мужчин и среднего возраста
    //ввод информации в файл
    public void InputFile2(Person[] persons) throws IOException {
        File file = new File("document.txt");
        file.deleteOnExit();
        FileWriter writer = new FileWriter(file, true);
        writer.append("Средний возраст: " + this.AverageAgeCounter(persons) + "; кол-во мужчин: " + this.ManNumberCounter(persons)+". ");
        writer.flush();
        writer.close();
    }

    //вывод информации из файла
    public static void OutOfFile() throws IOException {
        File file = new File("document.txt");
        FileReader reader = new FileReader(file);
        int numb;
        char[] buffer = new char[1];
        do {
            numb = reader.read(buffer);
            System.out.print(buffer[0]);
        } while (numb == 1);
        reader.close();
    }
}
