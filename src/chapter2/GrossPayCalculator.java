package chapter2; //package declaration

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours that employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2.Get the hourly pay rate
        System.out.println("Enter the hourly pay rate.");
        double payRate = scanner.nextDouble();
        scanner.close();

        //3.Multiply hours and pay rate
        double pay = hours*payRate;

        //4.Display result
        System.out.println("The gross pay for the employee is: " + pay);

    }
}
