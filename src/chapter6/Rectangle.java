package chapter6;

public class Rectangle {

    //Fields of a rectangle:
    private double length;
    private double width;

    //Default constructor (no parameters):
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); //can be set this way
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    //Actions of a rectangle: calculatePerimeter, calculateArea
    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    public double calculateArea(){
        return length*width;
    }

}
