package colectii.maping;

import colectii.maping.car.Car;
import colectii.maping.car.Model;
import colectii.maping.car.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        ///////////////CHEIA este INDEXUL si VALOAREA este valoarea care se introduce la INDEX//////////////
        //este cea mai complexa structura de date si ce amai utilizata metoda de date
        //cautarile se fac dupa CHEIE

        Map<String, String> map = new HashMap<>(); //functioneaza pe principiul de CHEIE si VALOARE
        map.put("Cernescu", "Stefan");
        map.put("Ene", "Alex");
        map.put("Costiuc", "Sorin"); //cheia - Costiuc; valoarea - Sorin

        System.out.println(map.get("Ene"));

        Map<String, Car> cars = new HashMap<>();
        cars.put("SBC", new Car(Model.Volkswagen, 2008, "Blue"));
        cars.put("ABC", new Car(Model.BMW, 2017, "Black"));
        cars.put("AAA", new Car(Model.AUDI, 2010, "White"));
        cars.put("AAA", new Car(Model.Volvo, 2010, "White"));  // suprascrie cel anterior pentru ca se duplica CHEIA

        System.out.println(cars.get("SBC"));
        System.out.println(cars.get("AAA"));
        System.out.println("---------------" + "\n" + "---------------");

        Map<Person, Car> newCars = new HashMap<>();
        Person stefan = new Person("Cernescu", "Stefan");
        Person alex = new Person("Ene", "Alex");
        Person sorin = new Person("Costiuc", "Sorin");
        newCars.put(stefan, new Car(Model.Volkswagen, 2021, "Blue"));
        newCars.put(new Person("Ene", "Alex"), new Car(Model.AUDI, 2022, "Black"));
        newCars.put(sorin, new Car(Model.Volvo, 2022, "Black"));

        System.out.println("Details: " + newCars.get(stefan));
        System.out.println("Details, another mode: " + newCars.get(new Person("Cernescu", "Stefan")));


        System.out.println("---------------" + "\n" + "---------------");
/////////////////////Cautare 2 numere care au o anumita suma////////////////////
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 6, 72, 1, 23);
        Integer sum = 5;

        Map<Integer, Integer> sumOfTwoNumbers = new HashMap<>();
        for (Integer number : list) {
            if (sumOfTwoNumbers.get(number) != null) {
                System.out.println(sum + " este suma a - Key: " + number + "; " + "Value: " + sumOfTwoNumbers.get(number));
            } else {
                sumOfTwoNumbers.put(sum - number, number);
            }
        }
        System.out.println("---------------" + "\n" + "---------------");



    }
}
