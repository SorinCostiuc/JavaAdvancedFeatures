package recap;

public class Pizza extends Food {

    public Pizza() {

    }

    @Override
    public void mixIngredients() {
        System.out.println("Mixing pizza ingredients");
        for(int i=0; i<getIngredients().length; i++) {
            System.out.println(getIngredients()[i]);
        }
    }
}
