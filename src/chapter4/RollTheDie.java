package chapter4;

import java.util.Random;

/**
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 */
public class RollTheDie {

    public static void main(String[] args){
        //Initialize the user's start position
        int position = 0;
        int goal=20;
        int maxRolls=5;
        Random random = new Random();

        for(int i=1; i<=maxRolls; i++){
            //Roll the dice and advance the user on the game board
            int dice = random.nextInt(6)+1;
            position +=dice;
            goal-=dice;

            if(position==20){
                System.out.println("Roll #" + i + ": You've rolled a " + dice + ". You are now " +
                        "on space " + position + ". You won! Congrats!");
                break;
            }

            if(position>20){
                System.out.println("Roll #" + i + ": You've rolled a " + dice + ". You are now " +
                        "on space " + position + ". That's too much, alas");
                break;
            }

            System.out.println("Roll #" + i + ": You've rolled a " + dice + ". You are now " +
                    "on space " + position + " and have " + goal + " more to go.");
        }
        if(position!=20){
            System.out.println("You lost! Try again maybe");
        }

    }
}
