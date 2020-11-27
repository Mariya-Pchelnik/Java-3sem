package lab3_1;

public class Yogurt extends Dairy{
    private String addition;
    private int volume;
    private String term;

    public Yogurt(String srok, int belok, int fat, String addition, int volume, String term) {
        super(srok, belok, fat);
        this.addition = addition;
        this.volume = volume;
        this.term = term;
    }

    public Yogurt(String srok, int belok, int fat, String addition, int volume) {
        super(srok, belok, fat);
        this.addition = addition;
        this.volume = volume;
    }

    public Yogurt(String addition, int volume, String term) {
        this.addition = addition;
        this.volume = volume;
        this.term = term;
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
    public String Manufacturer(){
        String manutacturer="Молочный мир";
        return manutacturer;
    }
}
