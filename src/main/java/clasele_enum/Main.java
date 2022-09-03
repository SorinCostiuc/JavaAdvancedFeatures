package clasele_enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(Coffee.IRISH.getValue());
        System.out.println(Coffee.getByValue("irish").getPrice());
        System.out.println(Coffee.IRISH.getPrice());  //same result

    }
}
