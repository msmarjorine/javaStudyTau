package chapter10.homework;

public class Market {

    public static void main(String[] args){
        Fruit smth = new Fruit(70.00);
        smth.makeJuice();
        System.out.println("Smth has the following amount of calories: " + smth.getCalories());

        Apple ruby = new Apple();
        ruby.makeJuice();
        ruby.removeSeeds();
        System.out.println("Ruby has the following amount of calories: " + ruby.getCalories());

        Orange skweesh = new Orange();
        skweesh.makeJuice();
        skweesh.peel();
        System.out.println("Skweesh has the following amount of calories: " + skweesh.getCalories());

        Fruit prince = new Apple();
        prince.makeJuice();
        ((Apple) prince).removeSeeds();
        System.out.println("Prince has the following amount of calories: " + prince.getCalories());

        squeeze(smth);
        squeeze(ruby);
        squeeze(skweesh);
        squeeze(prince);

    }

    public static void squeeze(Fruit fruit){
        if(fruit instanceof Apple){
            System.out.println("Squeezing the apple really hard");
        } else if(fruit instanceof Orange){
            System.out.println("Squeezing the orange really delicate");
        } else {
            System.out.println("Fruits should be squeezed with tenderness");
        }
    }
}
