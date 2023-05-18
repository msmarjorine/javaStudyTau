package chapter5;

import java.util.Scanner;

/**
 * The first method
 */
public class Greetings {

    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        greetUser(name);
    }

    public static void greetUser(String username){
        System.out.println("Hi there, " + username);
    }
}
