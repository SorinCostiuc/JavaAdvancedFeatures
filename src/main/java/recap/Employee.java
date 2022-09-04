package recap;

public class Employee implements Contract{

    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }

    @Override
    public String getString() {
        return "String";
    }
}
