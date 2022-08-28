package recap;

public abstract class Food {
    private String[] ingredients;
    private int index;

    public Food() {
        ingredients = new String[3];
        System.out.println("All foods will be prepared");
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void addIngredient(final String ingredient) {
        ingredients[index] = ingredient;
        index++;
    }

    public void setIngredients(final String[] ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void mixIngredients();
}
