package chapter5;

import java.text.DecimalFormat;

public class RoundedNumber {

    public static void main(String[] args){
        double numb1 = 456.98457770005;

        DecimalFormat df = new DecimalFormat("#.##");
        String numb1Formatted = df.format(numb1);
        //double numb2Formatted = Double.parseDouble(numb1Formatted);
        //Doesn't work because numb1Formatted is separated with a comma

        System.out.println("The formatted number as a string variable: " + numb1Formatted);
        //System.out.println("The formatted string as a double variable: " + numb2Formatted);

    }
}
