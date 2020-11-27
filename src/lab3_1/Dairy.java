package lab3_1;

public class Dairy {
    private String srok;
    private int belok;
    private  int fat;

    public String getSrok() {
        return srok;
    }

    public int getBelok() {
        return belok;
    }

    public int getFat() {
        return fat;
    }

    public Dairy(String srok, int belok, int fat) {
        this.srok = srok;
        this.belok = belok;
        this.fat = fat;
    }
    public Dairy(){
        srok="До 2020";
        belok=32;
        fat= 5;
    }

    public String Manufacturer(){
        String manufacturer="Unknown";
        return manufacturer;
    }
}
