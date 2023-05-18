package w3examples;

import java.util.Scanner;

//Create a main class
public class Main {
    //Create a fullThrottle method:
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    // Create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args){
        Main myCar = new Main(); //Create a myCar object
        myCar.fullThrottle(); //Call the method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your desired speed here");
        int speedy = scanner.nextInt();
        myCar.speed(speedy); //Call the method

    }
}
