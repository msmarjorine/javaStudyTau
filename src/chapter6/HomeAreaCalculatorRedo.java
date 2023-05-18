package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //Create an instance of the class to access methods which are not static
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rect1, Rectangle rect2){
        return rect1.calculateArea() + rect2.calculateArea();
    }
}
