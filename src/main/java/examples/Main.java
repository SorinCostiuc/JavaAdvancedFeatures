package examples;

import examples.car.Bike;
import examples.car.Car;
import examples.car.Truck;
import examples.car.Vehicle;
import examples.movies.Comedy;
import examples.movies.Horror;
import examples.movies.Movie;
import examples.movies.Studio;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        System.out.println(bike.getIdentity());     // Se rezolva prin FOR

        Vehicle car = new Car();
        System.out.println(car.getIdentity());     // Se rezolva prin FOR

        Vehicle truck = new Truck();
        System.out.println(truck.getIdentity());   // Se rezolva prin FOR
        System.out.println("----------------");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bike;
        vehicles[1] = car;
        vehicles[2] = truck;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getIdentity());
        }
        System.out.println("----------------");
        System.out.println("");
        System.out.println("----------------");

        Studio studio = new Studio();
        studio.makeMovies();

    }
}
