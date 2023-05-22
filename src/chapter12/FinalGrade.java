package chapter12;

import java.util.Map;


/**
 * Given two Maps of test scores, you need to update the student's grades
 * only if they did better on the makeup exam. Then print the final grades.
 * We need to go through 2 Maps in your code and determine the final grade based on which one of these are higher.
 */
public class FinalGrade {

    public static void main(String[] args){
        Map<String, Integer> firstGrades = TestResults.getOriginalGrades();
        Map<String, Integer> secondGrades = TestResults.getMakeUpGrades();

        for(var student: secondGrades.entrySet()){
            Integer firstGrade = firstGrades.get(student.getKey());
            Integer secondGrade = secondGrades.get(student.getKey());

            if(secondGrade>firstGrade){
                firstGrades.put(student.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grades:");
        firstGrades.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
    }
}
