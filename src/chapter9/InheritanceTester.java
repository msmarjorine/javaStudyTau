package chapter9;

public class InheritanceTester {

    public static void main(String[] args){

        /*Person person = new Person();
        Employee employee = new Employee();
        person.setName("Nastya");
        person.setAge(32);
        person.setGender("female");
        employee.setName("Grian");
        employee.setAge(28);
        employee.setGender("male");
        employee.setEmployeeId(42);
        employee.setTitle("musician");
        System.out.println(person.getName());
        System.out.println(employee.getName());*/

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("tomato");

        testSquareOverride();

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8);
        rectangle.setWidth(4);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(2);
        System.out.println(square.calculatePerimeter());
    }
}
