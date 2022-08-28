package Inheritance.animal;

public class Dog extends Animal {
    public Dog(){
        System.out.println("I'm a dog");
    }

    @Override
    void makeSound(){
        System.out.println("Ham ham");
    }
}
