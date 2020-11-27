package lab3_2;

public class WriteInfo {
    public static void main(String[] args) {

    Kefir kefir=new Kefir(" до 04.04.2021", 30, 7, 250, 20);
    kefir.print();
   Tvorog tvorog= new Tvorog(". Годен до 03.03.2021", 33, 7, 100, "зернистый");
    tvorog.print();
    Yougurt1 yougurt1= new Yougurt1("До 02.01.2020", 30, 3, "С вишней", 45, "термический", "Питьевой йогурт");
    yougurt1.print();
Yougurt2  yougurt2= new Yougurt2("До 02.01.2020", 30, 3, "С вишней", 45, "термический", "Йогурт в стаканчике");
yougurt2.print();
    }
}
