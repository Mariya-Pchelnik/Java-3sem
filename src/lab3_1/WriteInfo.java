package lab3_1;

public class WriteInfo {
    public static void main(String[] args) {
        Yogurt yogurt1 = new Yogurt("До 01.01.2020", 32, 5, "c клубникой", 50, "термизированный");
        System.out.println("Йогурт производителя " + yogurt1.Manufacturer() + ". Годен " + yogurt1.getSrok() + ". Кол-во белка " + yogurt1.getBelok() + ". Процент жирности " + yogurt1.getFat() + ". Добавка - " + yogurt1.getAddition() + ". Объем " + yogurt1.getVolume() + ", " + yogurt1.getTerm());
        Yogurt yogurt2 = new Yogurt("До 02.01.2020", 30, 3, "С вишней", 45);
        System.out.println("Йогурт производителя " + yogurt2.Manufacturer() + ". Годен " + yogurt2.getSrok() + ". Кол-во белка " + yogurt2.getBelok() + ". Процент жирности " + yogurt2.getFat() + ". Добавка - " + yogurt2.getAddition() + ". Объем " + yogurt2.getVolume());
        Yogurt yogurt3 = new Yogurt("С черникой", 30, "термизированный");
        System.out.println("Йогурт производителя " + yogurt3.Manufacturer() + ". Годен " + yogurt3.getSrok() + ". Кол-во белка " + yogurt3.getBelok() + ". Процент жирности " + yogurt3.getFat() + ". Добавка - " + yogurt3.getAddition() + ". Объем " + yogurt3.getVolume() + ", " + yogurt1.getTerm());
        Tvorog tvorog = new Tvorog(". Годен до 03.03.2021", 33, 7, 100, "зернистый");
        System.out.println("\nТворог производителя " + tvorog.Manufacturer() + tvorog.getSrok() + ". Кол-во белка " + tvorog.getBelok() + ". Процент жирности " + tvorog.getFat() + ". Масса " + tvorog.getMassa() + ", " + tvorog.getZernistost());
        Tvorog tvorog1 = new Tvorog(". Годен до 04.03.2021", 34, 5, 150);
        System.out.println("Творог производителя " + tvorog1.Manufacturer() + tvorog1.getSrok() + ". Кол-во белка " + tvorog1.getBelok() + ". Процент жирности " + tvorog1.getFat() + ". Масса " + tvorog1.getMassa());
        Tvorog tvorog2 = new Tvorog(200, "зернистый");
        System.out.println("Творог производителя " + tvorog2.Manufacturer() + ". Годен " + tvorog2.getSrok() + ". Кол-во белка " + tvorog2.getBelok() + ". Процент жирности " + tvorog2.getFat() + ". Масса " + tvorog2.getMassa() + ", " + tvorog2.getZernistost());
        Tvorog tvorog3 = new Tvorog(250);
        System.out.println("Творог производителя " + tvorog3.Manufacturer() + ". Годен " + tvorog3.getSrok() + ". Кол-во белка " + tvorog3.getBelok() + ". Процент жирности " + tvorog3.getFat() + ". Масса " + tvorog3.getMassa());
        Kefir kefir1 = new Kefir(" до 04.04.2021", 30, 7, 250, 20);
        System.out.println("\nКефир производителя " + kefir1.Manufacturer() + ". Годен " + kefir1.getSrok() + ". Кол-во белка " + kefir1.getBelok() + ". Процент жирности " + kefir1.getFat() + ". Объем " + kefir1.getVolume() + ". Количество бифидобактерий" + kefir1.getAmount());
        Kefir kefir2 = new Kefir(300, 22);
        System.out.println("Кефир производителя " + kefir2.Manufacturer() + ". Годен " + kefir2.getSrok() + ". Кол-во белка " + kefir2.getBelok() + ". Процент жирности " + kefir2.getFat() + ". Объем " + kefir2.getVolume() + ". Количество бифидобактерий" + kefir2.getAmount());
    }
}
