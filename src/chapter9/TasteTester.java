package chapter9;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("vanilla");
        cake.setPrice(26.50);

        System.out.println("The features of a pure cake");
        System.out.println(cake.getFlavor());
        System.out.println(cake.getPrice());

        BirthdayCake bdCake = new BirthdayCake();
        bdCake.setFlavor("chocolate");
        bdCake.setPrice(38.70);
        bdCake.setCandles(29);
        System.out.println("The features of a birthday cake");
        System.out.println(bdCake.getFlavor());
        System.out.println(bdCake.getPrice());
        System.out.println(bdCake.getCandles());

        WeddingCake wdCake = new WeddingCake();
        wdCake.setFlavor("pina colada");
        wdCake.setPrice(90.00);
        wdCake.setTiers(3);
        System.out.println("The features of a wedding cake");
        System.out.println(wdCake.getFlavor());
        System.out.println(wdCake.getPrice());
        System.out.println(wdCake.getTiers());

    }
}
