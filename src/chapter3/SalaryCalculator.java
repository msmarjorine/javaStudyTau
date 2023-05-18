package chapter3;

import java.util.Scanner;

/**
 Here we'll add if statement to calculate salaries depending on the effectiveness
 */
public class SalaryCalculator {

    public static void main(String[] args){
        //Initialize known values
        int standardPayment = 1000;
        int bonus = 250;
        int quota = 10;
        int totalPayment;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        boolean getBonus = sales>quota;

        //Quick detour for the bonus earners
        if(getBonus){
            totalPayment = standardPayment + bonus;
        } else {
            totalPayment = standardPayment;
        }

        //Output
        System.out.println("The total payment for the employee is " + totalPayment);
    }
}
