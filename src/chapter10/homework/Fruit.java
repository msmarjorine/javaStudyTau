package chapter10.homework;

public class Fruit {
    private double calories;
    public Fruit(double calories){
        setCalories(calories);
    }
    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("The juice is being made!");
    }

}
