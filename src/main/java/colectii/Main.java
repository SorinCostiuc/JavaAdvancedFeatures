package colectii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Sorin");
        names.add("Alexandra");
        names.add("Lucinia");

        names.remove("Alexandra");
        System.out.println(names.isEmpty());

        for (String name: names){
            System.out.println(name);
        }

        System.out.println("---------------"+"\n"+"---------------");
        for (String name: names){
            if (name.equals("Sorin")){
                System.out.println("Te-am gasit");
            }
        }
        if (names.contains("Sorin")){
            System.out.println("Te-am gasit mai simplu");
        }
        System.out.println("---------------"+"\n"+"---------------");
        //ARRAY in ARRAYLIST si invers
        String[] namesAsArray = new String[]{"Sorin", "Alexandra"};
        List <String> namesAsList = Arrays.asList(namesAsArray);
//        String[] namesInArray = (String[]) names.toArray(); ---LIST ca ARRAY
        names.addAll(namesAsList);
        for (String name: names){
            System.out.println(name);
        }

        System.out.println(names.get(names.indexOf("Sorin")));
        System.out.println("---------------"+"\n"+"---------------");

        Person person1 = new Person();
        person1.setFirstName("Stefan");
        person1.setLastName("Cernescu");

        Person person2 = new Person();
        person2.setFirstName("Alex");
        person2.setLastName("Ene");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        for (Person person: people){
            if (person.getFirstName().equals("Stefan")){
                System.out.println(person.getLastName());
            }
        }
        System.out.println("---------------"+"\n"+"---------------");
        Grocery food = new Food();
        food.setName("CupCake");
        food.setPrice(5);

        Grocery cola = new Drink();
        cola.setName("Coca Cola");
        cola.setPrice(10);

        List<Grocery> groceries = new ArrayList<>();
        groceries.add(food);
        groceries.add(cola);


    }
}
