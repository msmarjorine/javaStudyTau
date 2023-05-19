package chapter10;

public class Zoo {

    public static void main(String[] args){
       Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound(); //no access to fetch
        ((Dog) sasha).fetch();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound(); //no access to scratch
        ((Cat) sasha).scratch(); //<--type casting
        feed(sasha);

        Animal cappy = new Animal();
        cappy.makeSound();
        feed(cappy);
    }

    public static void feed(Animal animal){
        //We want to figure out exactly what the subclass is
        if(animal instanceof Dog){
            System.out.println("here is your dog food");
        } else if(animal instanceof Cat){
            System.out.println("here is your cat food");
        } else {
            System.out.println("take some universal food");
        }
    }
}
