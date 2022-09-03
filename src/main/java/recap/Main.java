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
    }
}
