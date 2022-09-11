package programareFunctionala;

import java.util.List;

public class Calculate {
//    se denumeste ca interfata
    private EvenNumbers evenNumbers;

    public Calculate(EvenNumbers evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> getMyEvenNumbers(List<Integer> numbers){
        return evenNumbers.filterNumbers(numbers);
    }
}
