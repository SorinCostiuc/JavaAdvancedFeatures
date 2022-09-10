package recap;

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
        f(1,1,8);
        System.out.println("------------");


    }


    ///////////////////METODE RECURSIVE/////////////////////////////
    ////////////////SE VA EVITA PE CAT DE DES SE POATE/////////////////
    private static int f(int firstNumber, int secondNumber, int n) {
        int sum = firstNumber + secondNumber;
        if (sum < n) {
            System.out.println(sum);
            return f(sum, firstNumber, n);
        }
        return sum;
    }
}
