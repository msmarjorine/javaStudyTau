package chapter5;

import java.util.Scanner;

/**
 * You're going to calculate a cellphone bill.
 * So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
 * And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
 * I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 * Please print this as an itemized bill. I have an example of the output expected down below.
 */
public class CellphoneBill {

    //Global variables
    static double charge = 0.25;
    static int taxRate = 15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();
        double overageFee = getOverageFee(overageMinutes);
        double subtotal = calculateSubtotal(baseCost, overageFee);
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);
        printBill(baseCost, overageFee, tax, total);
    }

    public static double getBaseCost(){
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }
    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double getOverageFee(int overageMinutes){
        double overageFees = overageMinutes*charge;
        return overageFees;
    }
    public static double calculateSubtotal(double baseCost, double overageFee){
        double subtotal = baseCost+overageFee;
        return subtotal;
    }
    public static double calculateTax(double subtotal){
        double tax = subtotal*taxRate/100;
        return tax;
    }
    public static double calculateTotal(double subtotal, double tax){
        double total = subtotal+tax;
        return total;
    }
    public static void printBill(double baseCost, double overageFee, double tax, double total){

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + baseCost + "$;");
        System.out.println("Overage fees: " + overageFee + "$;");
        System.out.println("Tax: " + tax + "$;");
        System.out.println("Total: " + total + "$");
    }
}
