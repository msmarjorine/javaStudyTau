package chapter6;

import java.util.Scanner;

public class PhoneBillRedo {

    //Each phone bill should have:
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    //3 constructors:
    public PhoneBillRedo(){
        id=0;
        baseCost = 25;
        allottedMinutes = 300;
        usedMinutes = 320;
    }

    public PhoneBillRedo(int id){
        this.id=id;
        baseCost = 25;
        allottedMinutes = 300;
        usedMinutes = 320;
    }
    public PhoneBillRedo(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id=id;
        this.baseCost=baseCost;
        this.allottedMinutes=allottedMinutes;
        this.usedMinutes=usedMinutes;
    }

    //Getters and setters:
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    public int getUsedMinutes(){
        return usedMinutes;
    }
    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes=usedMinutes;
    }

    public double calculateOverage(){
        int overage;
        double overageCharge = 0.25;
        if(usedMinutes<=allottedMinutes){
            overage=0;
        } else {
            overage = usedMinutes-allottedMinutes;
        }
        return overage*overageCharge;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate*(baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printBill(){
        System.out.println("Your phone bill is ready.");
        System.out.println("Id: " + id);
        System.out.println("Base Rate: " + baseCost);
        System.out.println("Overage Fee: " + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: " + String.format("%.2f", calculateTax()));
        System.out.println("Total sum: " + String.format("%.2f", calculateTotal()));
    }
}
