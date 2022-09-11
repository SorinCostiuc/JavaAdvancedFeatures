package programareFunctionala;

import java.util.List;

@FunctionalInterface
public interface EvenNumbers {
    List<Integer> filterNumbers(List<Integer> numbers);
//    pentru a seta descrieri pentru ce actiune ar trebui facuta

//    void doSomethingElse();    ///se paote doar o singura metoda
}
