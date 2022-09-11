package programareFunctionala;

import java.util.ArrayList;
import java.util.List;
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
                .findFirst().get();
        System.out.println(numberFound);
        System.out.println("----------");
//          print all greater than 20
        someNumbers.stream()
                .filter(number -> number % 2 != 1)
                .map(number -> number * 2)
                .filter(number -> number > 20)
                .collect(Collectors.toList()) //.toList - in a version greater than java 11
                .forEach(number -> System.out.println(number)); //.forEach(System.out::println);  - in a version greater than java 11


    }
}
