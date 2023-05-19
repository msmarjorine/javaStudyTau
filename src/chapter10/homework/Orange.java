package chapter10.homework;

public class Orange extends Fruit{
    public Orange() {
        super(48.80);
    }
    @Override
    public void makeJuice(){
        System.out.println("The orange juice is being made!");
    }

    public void peel(){
        System.out.println("The orange is peeled and ready to eat!");
    }
}
