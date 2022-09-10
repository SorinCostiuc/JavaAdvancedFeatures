package Inheritance.interfata.animal;

public class Main {
    public static void main(String[] args) {
       //        ABSTRACT
//        Animal animal = new Animal(); - pentru ca a fost facuta ABSTRACT, nu mai poate fi instantata - doar copii Clasei ANIMAL
//        animal.eat();

//        MOSTENIRI
        Cat cat = new Cat();
//        Animal cat = new Cat(); - se paote face si asa
        cat.eat();
        cat.makeSound();

        //ENCAPSULAREA
        //se face cu PRIVATE
//        cat.setA(2);
//        System.out.println(cat.getA());


        Dog dog = new Dog();
//        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

    }
}
