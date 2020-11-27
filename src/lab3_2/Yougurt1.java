package lab3_2;

public class Yougurt1 extends Yogurt {
    String name;

    public Yougurt1(String srok, int belok, int fat, String addition, int volume, String term, String name) {
        super(srok, belok, fat, addition, volume, term);
        this.name = name;
    }

    public String Manufacturer(){
        String manufacturer="Молочный мир";
        return  manufacturer;
    }
    public void print() {

        System.out.println(name+" производителя " + Manufacturer()+ ". Годен " + getSrok() + ". Кол-во белка " + getBelok() + ". Процент жирности " + getFat() + ". Добавка - " + getAddition() + ". Объем " + getVolume() + ", " + getTerm());
    }
}
