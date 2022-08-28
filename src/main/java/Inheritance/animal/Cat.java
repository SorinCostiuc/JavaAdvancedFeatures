package Inheritance.animal;

public class Cat extends Animal {
    public Cat(){
        System.out.println("I'm a cat");
    }
    //    private int a;
    @Override
    void makeSound() {
        System.out.println("Miau miau");
    }

    public int getLifeExpectation() {
        expectedLifeInYears = 15;
        return expectedLifeInYears;
    }

//    ENCAPSULATION
//    public int getA(){
//        return a;
//    }
//    public void setA(final int a){
//        if (a<0){
//            throw new ArithmeticException("Nu vrea numere mai mici decat 0");
//        }
//        this.a = a;
//    }
}


