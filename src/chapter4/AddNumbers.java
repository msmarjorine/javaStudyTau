package chapter4;

import java.util.Scanner;

/**
 * Do WHILE Loop
 */
public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again = false;

        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();
            double sum = num1+num2;
            System.out.println("The sum is " + sum);
            System.out.println("Do you wanna start over? (true or false)");
            again = scanner.nextBoolean();
        } while (again);

        scanner.close();
    }
}
