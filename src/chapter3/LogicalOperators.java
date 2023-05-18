package chapter3;
/**
 * Logical operators
 */

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("How long have you been working here?");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if(salary>=requiredSalary && years>=requiredYears){
            System.out.println("Your loan is approved, congrats!");
        } else {
            System.out.println("You can't take a loan, sorry.");
        }
    }
}
