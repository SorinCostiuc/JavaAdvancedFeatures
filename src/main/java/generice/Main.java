package generice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        //putem pune orice fel de tip si ne jucam//
        ////////RECICLEAZA CLASE SI METODE PENTRU DIFERITE TIPURI DE OBICETE/ELEMENTE/////////////
// /////////IS NOT LIQUID//////////

        Glass<String> glass = new Glass<>();
        glass.setObject("Stefan");
        glass.doSomethingObject();

        Glass<Integer> glass1 = new Glass<>(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        glass1.add(123);
        glass1.doSomething();

        Glass<Float> glass2 = new Glass<>();
        glass2.setObject(0.2f);
        glass2.doSomethingObject();

        System.out.println("---------------" + "\n" + "---------------");

        Cup<Tea> firstCup = new Cup<>();
        firstCup.setLiquid(new Tea(32, "purple"));
        firstCup.drink();
        System.out.println("-----");
        Cup<Water> secondCup = new Cup<>();
        secondCup.setLiquid(new Water(10, "non colour"));
        secondCup.drink();
        System.out.println("-----");
        Cup<Juice> thirdCup = new Cup<>();
        thirdCup.setLiquid(new Juice(15, "orange"));
        thirdCup.drink();
        System.out.println("---------------" + "\n" + "---------------");
    }
}
