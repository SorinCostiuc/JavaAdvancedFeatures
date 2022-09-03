package exercitii;

public enum Shopping {
    TV(1200),
    FRIDGE(1000),
    WASHING_MACHINE(1500),
    ESPRESSOR(500);


    private Integer price;

    Shopping(Integer price) {
        this.price = price;

    }

    public Integer getPrice() {
        return price;
    }
}
