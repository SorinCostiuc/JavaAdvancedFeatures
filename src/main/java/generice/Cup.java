package generice;

public class Cup<E extends Liquid> {

    private E liquid;



    public E getLiquid() {
        return liquid;
    }
    public void setLiquid(E liquid) {
        this.liquid = liquid;
    }

    public Cup(E liquid) {
        this.liquid = liquid;
    }
    public Cup() {

    }

    public void drink(){
        System.out.println("I'm drinking " + liquid);
    }
}
