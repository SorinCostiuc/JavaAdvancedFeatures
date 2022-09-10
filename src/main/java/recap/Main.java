package recap;

import recap.food.Food;
import recap.food.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.addIngredient("Onions");
        pizza.addIngredient("Salami");
        pizza.addIngredient("Mushrooms");
//        pizza.setIngredients(new String[]{"Onions", "Salami", "Mushrooms"});
        pizza.mixIngredients();


        Food food = new Food() {
            @Override
            public void mixIngredients() {
                System.out.println("Mixing ingredients");
            }
        };
        food.mixIngredients();
//        RECURSIVE//
        int firstNumber = 1;
        int secondNumber = 1;
        System.out.println("------------");
        f(1, 1, 8);
        System.out.println("------------");

//        ///////////FOR EACH///////////
        List<String> personNames = new ArrayList<>();
        personNames.add("Ioana");
        personNames.add("Stefan");

//        FOR SIMPLU - itereaza indecsii
        for (int i = 0; i < personNames.size(); i++) {
            System.out.println(personNames.get(i));
        }

//        FOR SIMPLU - itereaza valorile
        for (String name : personNames) {
            System.out.println(name);
        }

    }

    ///////////////////METODE RECURSIVE/////////////////////////////
    ////////////////SE VA EVITA PE CAT DE DES SE POATE/////////////////
    //creeaza foarte multe duplicate, pentru ca genereaza toate variantele posibile
//    se foloseste ca sa genereze toate variantele posibile
    private static int f(int firstNumber, int secondNumber, int n) {
        int sum = firstNumber + secondNumber;
        if (sum < n) {
            System.out.println(sum);
            return f(sum, firstNumber, n);
        }
        return sum;
    }
}
