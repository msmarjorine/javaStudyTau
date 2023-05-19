package chapter10.homework;

public class Apple extends Fruit{
    public Apple(){
        super(36.90);
    }

    @Override
    public void makeJuice(){
        System.out.println("The apple juice is being made! Now on sale.");
    }

    public void removeSeeds(){
        System.out.println("The seeds are removed from the apple.");
    }
}
