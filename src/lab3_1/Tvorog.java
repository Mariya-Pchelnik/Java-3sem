package lab3_1;

public class Tvorog extends Dairy{
    private int massa;
    private String zernistost;

    public Tvorog(String srok, int belok, int fat, int massa, String zernistost) {
        super(srok, belok, fat);
        this.massa = massa;
        this.zernistost = zernistost;
    }

    public Tvorog(String srok, int belok, int fat, int massa) {
        super(srok, belok, fat);
        this.massa = massa;
    }

    public Tvorog(int massa, String zernistost) {
        this.massa = massa;
        this.zernistost = zernistost;
    }

    public Tvorog(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public String getZernistost() {
        return zernistost;
    }
    public String Manufacturer(){
        String manufacturer="Савушкин продукт";
        return manufacturer;
    }
}
