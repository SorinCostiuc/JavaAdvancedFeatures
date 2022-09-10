package Inheritance.interfata.animal;

public abstract class Animal {
    public Animal(){
        System.out.println("I'm an animal");
    }
    protected int expectedLifeInYears;

    public void eat(){
        System.out.println("I'm eating food");
    }

    abstract void makeSound();
}
