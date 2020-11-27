package lab4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++)
         persons[i]=new Person();
        for (int i=0; i<3;i++)
        persons[i].InputFile();
        persons[0].InputFile2(persons);
        Person.OutOfFile();
    }


}
