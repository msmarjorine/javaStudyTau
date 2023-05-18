package chapter4;

import java.util.Scanner;

/**
 * WHILE Loop, used to validate input
 */
public class GrossPayInputValidation {

    public static void main(String[] args){

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked>maxHours || hoursWorked<1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again");
            hoursWorked = scanner.nextDouble(); //Sentinel - the variable that controls the flow of the loop
        }

        scanner.close();

        //Calculate gross
        double gross = rate*hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
