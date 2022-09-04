package colectii;

import colectii.groceries.Drink;
import colectii.groceries.Food;
import colectii.groceries.Grocery;
import colectii.lista_inlantuita_manuala.LinkedListManual;
import colectii.lista_inlantuita_manuala.Node;
import colectii.persons.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Sorin");
        names.add("Alexandra");
        names.add("Lucinia");

        names.remove("Alexandra");
        System.out.println(names.isEmpty());

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------------" + "\n" + "---------------");
        for (String name : names) {
            if (name.equals("Sorin")) {
                System.out.println("Te-am gasit");
            }
        }
        if (names.contains("Sorin")) {
            System.out.println("Te-am gasit mai simplu");
        }
        System.out.println("---------------" + "\n" + "---------------");
        //ARRAY in ARRAYLIST si invers
        String[] namesAsArray = new String[]{"Sorin", "Alexandra"};
        List<String> namesAsList = Arrays.asList(namesAsArray);
//        String[] namesInArray = (String[]) names.toArray(); ---LIST ca ARRAY
        names.addAll(namesAsList);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.get(names.indexOf("Sorin")));
        System.out.println("---------------" + "\n" + "---------------");

        Person person1 = new Person();
        person1.setFirstName("Stefan");
        person1.setLastName("Cernescu");

        Person person2 = new Person();
        person2.setFirstName("Alex");
        person2.setLastName("Ene");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        for (Person person : people) {
            if (person.getFirstName().equals("Stefan")) {
                System.out.println(person.getLastName());
            }
        }
        System.out.println("---------------" + "\n" + "---------------");
        Grocery food = new Food();
        food.setName("CupCake");
        food.setPrice(5);

        Grocery cola = new Drink();
        cola.setName("Coca Cola");
        cola.setPrice(10);

        List<Grocery> groceries = new ArrayList<>();
        groceries.add(food);
        groceries.add(cola);

//        REMOVEALL scoate mai multe elemente din lista

        System.out.println("---------------" + "\n" + "---------------");
//        String[] array = new String[5]; - dimensiunea fixa a unui array
//        String[] arrayList = new String[8]; - dimensiunea standard al unei LISTE
        List<String> list = new LinkedList<>();  //COLECTIE cu dimensiune dinamic...poate merge pana la infinit
//        vine cu NOD-uri care tine o VALOARE si un NEXT - contine o valoare si adresa urmatoarei valori

//        La extragerea unui element este mai usoara si mai eficienta intr-un array list decat intr-un linked list
        //la array list iti da direct index n, iar linked list parcurge toti indecsii pana ajunge la indexul dorit

//        DACA SE FOLOSESTE MAI MULT INSERARI SE FOLOSESTE LINKEDLIST
//        DACA SE FOLOSESTE MAI MULT SCOATERI SE FOLOSESTE ARRAYLIST

//                  LISTELE VOR PASTRA MEREU ORDINEA DE INSERARE

        ///////////CUM FUNCTIONEAZA MANUAL LINKED LIST/////////////////
        System.out.println("---------------" + "\n" + "---------------");
        LinkedListManual manualList = new LinkedListManual();
        Node node = new Node();
        node.setValue(1);
        node.setNext(null);

        Node node2 = new Node();
        node2.setValue(2);
        node2.setNext(null);

        Node node3 = new Node();
        node3.setValue(3);
        node3.setNext(null);
        manualList.add(node)
                .add(node2)
                .add(node3);
        manualList.printList();

        System.out.println("---------------" + "\n" + "---------------");
        System.out.println("---------------" + "\n" + "---------------");

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);
        for (Integer number : numbers) {
            System.out.println(number);
        }
//        SET foloseste functia HASH
/*
        functiile: f(x) = y;
        elementul se pune pe pozitia y
        daca se repeta, se suprascriu si nu ramana in memorie (se face overide)
 */
//        SET nu pastreaza ordinea la inserare
        System.out.println("---------------" + "\n" + "---------------");
//        Set<String> setNames = new HashSet<>(); // nu pastreaza ordinea la inserare
        Set<String> setNames = new LinkedHashSet<>(); // pastreaza ordinea la inserare SI ELIMINA DUPLICATE
        setNames.add("Andrei");
        setNames.add("Alexandra");
        setNames.add("Alexandra");
        setNames.add("George");
        setNames.add("Ramon");

        for (String name : setNames) {
//            System.out.println(name);
            System.out.println(name + " - " + name.hashCode());
        }
        /*
        f(x) = x^2
        - -2 => f(-2) = 4
        - 1 => f(1) = 1
        - 0 => f(0) = 0
        - 2 => f(2) = 4 - coliziune
      -  functiile hash nu sunt FUNCTII BIJECTIVE - pentru 2 imputuri diferite avem acelasi output ====> COLOZIUNE
      -  pentru a se rezolva problema coliziunii, pe un index se va face un list si se vor returna ambele valori
         */
        System.out.println("---------------" + "\n" + "---------------");


        ///////////////////ITERARE UN MAP////////////////////
        Map<Integer, Integer> mapper = new HashMap<>();
        mapper.put(1, 2);
        mapper.put(2, 245645);
        mapper.put(3, 24531);
        mapper.put(4, 2487);
        mapper.put(5, 254234);
        mapper.put(6, 242344);
        mapper.put(7, 2456345);

        for (Integer number : mapper.values()) {
            System.out.printf("%d ", number);
        }
        System.out.println("\n ---------------");
        for (Integer number : mapper.keySet()) {
            System.out.printf("%d ", number);
        }
        System.out.println("\n ---------------");
        for (Map.Entry<Integer, Integer> entry : mapper.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
