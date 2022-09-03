package clasele_enum.fara_enum;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.setName("latte");
        latte.setPrice(5);

        Coffee irish = new Coffee();
        irish.setName("irish");
        irish.setPrice(10);

        Coffee americano = new Coffee();
        americano.setName("americano");
        americano.setPrice(2);

        Coffee[] coffees = new Coffee[]{latte, irish, americano};
        for (Coffee coffee : coffees) {
            if ("irish".equals(coffee.getName())) {
                System.out.println(coffee.getPrice());
            }
        }

    }
}
