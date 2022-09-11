package programareFunctionala;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------" + "\n" + "Streaming API" + "\n" + "-------------------");
        List<Integer> someNumbers = List.of(1, 2, 6, 2, 5, 4, 8, 5, 1, 4, 5, 12, 3, 5, 412, 51, 12);
        List<Integer> someNewNumbers = new ArrayList<>();
        for (Integer number : someNumbers) {
            if (number % 2 != 1) {
                someNewNumbers.add(number * 2);
            }
        }
        for (Integer number : someNewNumbers) {
            if (number > 20) {
                System.out.println(number);
            }
        }
        System.out.println("----------");

        ////////Streaming API/////////
//        number greater than 20
        Integer numberFound = someNumbers.stream()
                .filter(number -> number % 2 != 1)
                .map(number -> number * 2)
                .filter(number -> number > 20)
                .findFirst().orElseGet(getNumberSupplier());     //daca valoarea mea este mai mare decat una existenta se face astfel: .findFirst().orElse(null);
        //orElse se va executa indiferent daca avem sau nu nevoie de el
        //supplierul se va executa doar daca avem nevoie de el (daca filtru nu da nici un rezultat)
        //punem orElseGet si dam metoda Supplier pentru a se executa doar atunci cand avem nevoie


        System.out.println(numberFound);

        System.out.println("----------");

//          print all greater than 20
        someNumbers.stream()
                .filter(number -> number % 2 != 1)
                .map(number -> number * 2)
                .filter(number -> number > 20)
                .collect(Collectors.toList()) //.toList - in a version greater than java 11
                .forEach(number -> System.out.println(number)); //.forEach(System.out::println);  - in a version greater than java 11

        System.out.println("----------");

        Supplier<Integer> number = getNumberSupplier();
        System.out.println(number.get());
        System.out.println("-------------------" + "\n" + "-------------------");

//        //////////INTERFATA FUNCTIONALA CREATA de noi///////////////
        EvenNumbers myInterface = (numbers) -> numbers.stream()
                .filter(myNumber -> myNumber % 2 != 1)
                .map(myNumber -> myNumber * 2)
                .collect(Collectors.toList());
        myInterface.filterNumbers(someNumbers)
                .forEach(System.out::println);


        System.out.println("-------------------");
//        refolosit codul de sus

        Calculate calculate = new Calculate(myInterface);
        calculate.getMyEvenNumbers(someNumbers)
                .forEach(System.out::println);


    }

    ////////////////EASY LOADING si LAZY LOADING///////////////
    private static Integer getNumber() {
        return 5 * 5;
    }

    private static Supplier<Integer> getNumberSupplier() {
        return () -> 5 * 5;
    }
}