package chapter5;

import java.util.Scanner;

/**
 * Variable scope
 */
public class InstantCreditCheck {

    //Initialize what we know
    static int requiredSalary=25000;
    static int requiredCreditScore=700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double s = getSalary();
        int c = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(s, c);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(salary>=requiredSalary && creditScore>= requiredCreditScore){
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats, you've been approved!");
        } else {
            System.out.println("Sorry, you've been declined.");
        }
    }
}
