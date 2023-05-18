package chapter7;

import java.util.Scanner;

public class WeekDay {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    private static int number;

    public static void main(String[] args){
        System.out.println("Please enter the week day number");
        int inputNumber = scanner.nextInt();
        if(inputNumber>=1 && inputNumber<=7){
            number=inputNumber;
            printDay();
        } else {
            System.out.println("Invalid input. Select a number between 1 and 7.");
        }
    }

    public static void printDay(){
        String output = days[number-1];
        System.out.println(output);
    }
}
