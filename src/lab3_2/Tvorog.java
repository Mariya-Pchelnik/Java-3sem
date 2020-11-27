package lab3_2;

public class Tvorog implements Dairy, Object{
    private String srok;
    private int belok;
    private  int fat;
    private int massa;
    private String zernistost;

    public Tvorog(String srok, int belok, int fat, int massa, String zernistost) {
        this.srok = srok;
        this.belok = belok;
        this.fat = fat;
        this.massa = massa;
        this.zernistost = zernistost;
    }


    @Override
    public String Manufacturer() {
        String manufacturer="Савушкин продукт";
        return  manufacturer;
    }


    @Override
    public void print() {
        System.out.println("Творог производителя " + Manufacturer() + srok + ". Кол-во белка " + belok + ". Процент жирности " + fat + ". Масса " +massa+ ", " + zernistost);
    }
}
