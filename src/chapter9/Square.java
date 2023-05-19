package chapter9;

public class Square extends Rectangle{
    @Override //Java knows that my intention is to override
    public double calculatePerimeter(){
        return sides*length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
