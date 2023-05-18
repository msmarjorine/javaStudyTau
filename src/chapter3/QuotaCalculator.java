package chapter3;

import java.util.Scanner;

/**
 * If/Else statement
 */
public class QuotaCalculator {
    public static void main(String[] args){
        //Initialize values we know
        int quota = 10;

        //Get the values we don't know
        System.out.println("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if(sales>=quota){
            System.out.println("Congratulations! You've met your quota!");
        } else {
            int salesShort = quota-sales;
            System.out.println("You are short of your quota by " + salesShort + " sales.");
        }
    }
}
