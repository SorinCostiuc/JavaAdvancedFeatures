package clasele_enum;

public enum Coffee {
    DOUBLE_ESPRESSO("Double espresso", 5),
    AMERICANO("americano", 2),
    LATTE("latte", 1),
    IRISH("irish", 10);

    private final String coffee;
    private final Integer price;

    Coffee(final String coffee, final Integer price) {
        this.coffee = coffee;
        this.price = price;
    }

    public String getValue() {
        return coffee;
    }
    public int getPrice(){
        return price;
    }
    public static Coffee getByValue(final String identifier){
        for(Coffee value: Coffee.values()){
            if (identifier.equals(value.getValue())){
                return value;
            }
        }
        return null;
    }
}
