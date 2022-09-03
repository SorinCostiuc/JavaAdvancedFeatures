package exercitii;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/*
- avem numerele 1, 2, 2, 4, 1, 7, 5, 12 intr-o lista
- suma anumitor numere este 11 (4+7)
 */
        int x = 11;
        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 1, 7, 5, 12);
//        NESIMPLIFICAT
        numbers.sort(Comparator.comparingInt(x2 -> x2));
//        numbers.sort((a,b) -> a-b)); //se poate si asa si este mai simplu
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == x) {
                    System.out.println("I have found your number");
                }
            }

        }
//        SIMPLIFICAT
        Set<Integer> foundNumbers = new HashSet<>();
        for (Integer number : numbers) {             //        for (int i = 0; i<numbers.size(); i++){
            if (foundNumbers.contains(number)) { //            if (foundNumbers.contains(numbers.get(i))){
                System.out.println("I have found the number");
            } else {
                foundNumbers.add(x - number);    //                foundNumbers.add(x - numbers.get(i));
            }
        }

        System.out.println("---------------" + "\n" + "---------------");
        /*
        - Vreau sa ies in oras si sa fac niste cumparaturi
        - Vreau sa vad cat am cheltuit: TV, frigider
        - nu voi cumpara de 2 ori acelasi lucru
         */
        Set<Shopping> shoppings = new HashSet<>();
        shoppings.add(Shopping.FRIDGE);
        shoppings.add(Shopping.TV);
        shoppings.add(Shopping.WASHING_MACHINE);
        shoppings.add(Shopping.ESPRESSOR);
        shoppings.add(Shopping.ESPRESSOR);

        int sum = 0;
        for (Shopping item: shoppings){
            sum+= item.getPrice();
        }
        System.out.println(sum);
        System.out.println("---------------" + "\n" + "---------------");
    }
}
