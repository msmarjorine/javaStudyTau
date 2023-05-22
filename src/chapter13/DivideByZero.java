package chapter13;

public class DivideByZero {

    public static void main(String[] args){
        dvdByZero();
    }
    public static int dvdByZero(){
        int c = 0;
        try {
            c = 30 / 0;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception, alas");
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun.");
        }
        return c;
    }
}
