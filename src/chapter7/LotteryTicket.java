package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6; //capslock for constants
    private static final int MAX_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;

            /*Generate random number, then search the array to make sure it doesn't exist already.
            If it does, regenerate and search again.
             */

            do{
                randomNumber = random.nextInt(MAX_NUMBER)+1;
            } while(search(ticket, randomNumber));

            //Number is unique if we get here. Add it to the array
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToCheck Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToCheck){
        //This is calls an enhanced loop. It iterates through array, each time assigning the current element to value
        for(int value: array){
            if(value == numberToCheck){
                return true;
            }
        }
        //If we've reached this point, then the entire array was searched, and the value was not found
        return false;
    }


}
