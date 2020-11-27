package lab3_1;

public class Kefir extends Dairy {
    private  int volume, amount;

    public Kefir(String srok, int belok, int fat, int volume, int amount) {
        super(srok, belok, fat);
        this.volume = volume;
        this.amount = amount;
    }

    public Kefir(int volume, int amount) {
        this.volume = volume;
        this.amount = amount;
    }

    public int getVolume() {
        return volume;
    }

    public int getAmount() {
        return amount;
    }
    public String Manufacturer(){
        String manufacturer="БелАкт";
        return manufacturer;
    }
}
