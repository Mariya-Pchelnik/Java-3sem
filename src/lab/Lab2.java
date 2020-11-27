package lab;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import lab2.Person;

public class Lab2 {
    public static void main(String[] args) {
        Person [] person= new  Person[4];
        person[0]=new Person("petrov","man",19);
        person[1]= new Person("ivanova", "women",31);
        person[2]=new Person();
        person[3]=new Person(person[0]);
        for(int i =0; i<4; i++){
            if(person[i].getSurname()==null) System.out.println("\nО человеке "+ (i+1)+" нет данных");
            else person[i].print();
        }
        System.out.println("\nКоличество мужчин:"+Person.ManNumber(person));
        System.out.println("Средний возраст:"+Person.AverageAge(person));
    }

}
