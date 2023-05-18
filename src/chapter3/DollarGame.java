package chapter3;

import java.util.Scanner;

/**
 * You're going to make a game — the objective of the game is to enter enough change to equal exactly one dollar.
 *
 */

public class DollarGame {
    public static void main(String[] args){
        //Declare variables for different coins
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        int dollar = 1;

        //Initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        //Ask for the user's input
        System.out.println("How many pennies would you like?");
        int pennyNumb = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        int nickelNumb = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int dimeNumb = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int quarterNumb = scanner.nextInt();

        //Count the sum and tell the results
        double sum = penny*pennyNumb + nickel*nickelNumb + dime*dimeNumb + quarter*quarterNumb;
        double sumRounded = Math.round(sum*100.00)/100.00;
        if(sum == dollar){
            System.out.println("You won! That's one dollar exactly! Congrats!");
        } else if(sum<dollar){
            System.out.println("Oops, that's not enough. Your result is " + sumRounded + "$.");
        } else {
            System.out.println("Oops, that's too much. Your result is " + sumRounded + "$.");
        }

    }
}
