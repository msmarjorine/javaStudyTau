package w3examples;

//create a class
public class ExampleConstructor {
    int x; //create a class attribute

    //create a class constructor:
    public ExampleConstructor(){
        x=5; //set the initial value for the class attribute x
    }

    public static void main(String[] args){
        ExampleConstructor myObj = new ExampleConstructor(); //this will call the constructor
        System.out.println("The initial value of x is " + myObj.x);
        myObj.x = 19;
        System.out.println("The updated value of x is " + myObj.x);

    }
}
