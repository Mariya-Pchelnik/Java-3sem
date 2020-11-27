package lab3_2;

public class Kefir implements Dairy, Object{
    private String srok;
    private int belok;
    private  int fat;
    private  int volume, amount;

    public Kefir(String srok, int belok, int fat, int volume, int amount) {
        this.srok = srok;
        this.belok = belok;
        this.fat = fat;
        this.volume = volume;
        this.amount = amount;
    }




    @Override
    public void print() {
        System.out.println("\nКефир производителя " + Manufacturer() + ". Годен " + srok + ". Кол-во белка " + belok + ". Процент жирности " + fat+ ". Объем " + volume + ". Количество бифидобактерий" + amount);


    }

    @Override
    public String Manufacturer() {
        return null;
    }
}
