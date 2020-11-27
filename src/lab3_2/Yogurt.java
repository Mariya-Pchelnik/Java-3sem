package lab3_2;

public abstract class Yogurt implements Dairy, Object{
    private String srok;
    private int belok;
    private  int fat;
    private String addition;
    private int volume;
    private String term;

    public String getSrok() {
        return srok;
    }

    public int getBelok() {
        return belok;
    }

    public int getFat() {
        return fat;
    }

    public String getAddition() {
        return addition;
    }

    public int getVolume() {
        return volume;
    }

    public String getTerm() {
        return term;
    }

    @Override
    public String Manufacturer() {
        return null;
    }

    @Override
    public void print() {

    }

    public Yogurt(String srok, int belok, int fat, String addition, int volume, String term) {
        this.srok = srok;
        this.belok = belok;
        this.fat = fat;
        this.addition = addition;
        this.volume = volume;
        this.term = term;
    }
}
