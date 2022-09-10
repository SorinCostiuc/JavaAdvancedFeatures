package generice;

public class Tea extends Liquid{
    public Tea(int temperature, String colour) {
        super(temperature, colour);
    }
    @Override
    public String toString() {
        return "Tea{" +
                "temperature=" + super.getTemperature() +
                ", colour='" + super.getColour() + '\'' +
                '}';
    }
}
