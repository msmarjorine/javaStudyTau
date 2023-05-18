package chapter4;

import java.util.Scanner;

/**
 *Using nested loops
 */
public class AverageTestScores {

    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i<numberOfStudents; i++){

            System.out.println("Let's calculate the average score of a student " + (i+1));

            double total = 0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total/numberOfTests;
            System.out.println("The average score of a student " + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
