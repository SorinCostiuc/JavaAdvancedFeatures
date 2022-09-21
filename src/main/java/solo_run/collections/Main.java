package solo_run.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*///TYPES////
    Set - a collection that cannot store duplicates.
    List - an ordered collection, may contain duplicates.
    Queue - a collection that implements the FIFO (first in, first out) or LIFO (last in, first out) mechanism.
    Deque - a kind of queue where you can add and remove items, both from the beginning and the end.
    Map - a collection for storing key-value pairs.
         */
        /*///INTRODUCTION/////////
        Collections, also often referred to as containers, i.e. objects that aggregate items. Collections are used to store objects, obtain stored data, or manipulate data.
In Java, collections built into the language are based on the following mechanisms:

    Interface: abstract data type representing collections. Interfaces allow collections to be manipulated independently of implementation details.
    Implementation: concrete implementation of the collection interfaces. These are most often reusable data structures.
    Algorithm: useful operations on data structures that most often have a [polymorphic] structure (oop.md#polymorphism).

Java collections give developers the following benefits:

    release the programmer from the obligation to implement data structures from scratch, which reduces the time needed to implement a specific functionality,
    implemented data structures use the most effective mechanisms, and their implementation is optimal,
    when designing your own data structures, there is no need to "reinvent the wheel". You can reuse existing ones.
         */
//        /////SET////
        final Set<Integer> numbersSet = new HashSet<>(); // initialization of HashSet
        System.out.println(numbersSet.isEmpty()); // true, Set does not contain elements
        numbersSet.add(1);
        numbersSet.add(17);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(1); // Adding an item with a value that already exists - the item is NOT added again
        numbersSet.forEach(System.out::println); //printed in order: 1 17 2 3
        System.out.println("----------");
        final Set<Integer> numbersTreeSet = new TreeSet<>();
        numbersTreeSet.add(1);
        numbersTreeSet.add(3);
        numbersTreeSet.add(2);
        numbersTreeSet.add(1); // Adding an item with a value that already exists - the item is NOT added again
        numbersTreeSet.forEach(System.out::println); //The order of the items will ALWAYS be the same (sorted in natural order): 1 2 3
        System.out.println("----------");
        final Set<Integer> numbersLinkedSet = new LinkedHashSet<>();
        numbersLinkedSet.add(1);
        numbersLinkedSet.add(3);
        numbersLinkedSet.add(2);
        numbersLinkedSet.add(1); // Adding an item with a value that already exists - the item is NOT added again
        numbersLinkedSet.forEach(System.out::println); //The order of items will ALWAYS be the same (in the order of adding items): 1 3 2

        System.out.println("-------------------" + "\n" + "-------------------");

//        ////LIST//////
        final List<String> names = new ArrayList<>();
        names.add("Andrew");  // adding an item to the end of the list
        names.add("Gregory"); // adding an item to the end of the list
        for (final String name : names) {
            System.out.println(name); // Andrew, Gregory will be displayed on the screen, keeping the order
        }
        System.out.println("----------");
        final List<String> names1 = new LinkedList<>();
        names1.add(0, "Andrew");  // adding an item to the top of the list
        names1.add(0, "Gregory"); // adding an item to the top of the list
        for (final String name : names1) {
            System.out.println(name); // Gregory, Andrew will be printed on the screen in order
        }

        System.out.println("-------------------" + "\n" + "-------------------");

//        ///Queue////
        /*
        Queue<String> events = new LinkedList<>();
        events.offer("ButtonClicked");
        events.offer("MouseMoved");
        System.out.println(events.peek());   // displaying the first element
        System.out.println(events.poll());   // removing the first item from the queue and returning a value
        System.out.println(events.poll());   // removing the first item from the queue again and returning the value
        System.out.println(events.isEmpty()); // at this point the queue is empty
*/
        // create a Deque object
        final Deque<Integer> deque = new ArrayDeque<>();
// add elements to deque
        deque.offerLast(2);
        deque.offerFirst(1);
        System.out.println(deque.pollLast()); // remove elements from deque along with removing from structure -> 2
        System.out.println(deque.peekLast()); // remove elements from deque without removing them from structure -> 1

        System.out.println("-------------------" + "\n" + "-------------------");

//        ////MAP/////
        /*
        The java.util.Map interface is a data structure that enables key-value data manipulation.
        Each key in such an object must be unique, i.e. one key can contain exactly one value.
        Map methods that are used to perform basic operations include:
    - put - is used to add a suitable pair to the collection or replace an old value with a new one for a specific key
    - get - Used to get a value based on a key
    - remove - removes an element based on a key (or additional value)
    - containsKey - Returns if there is a value in the map for the given key
    - containsValue - Returns if there is a key in the map for the given value
    - size - returns the number of pairs (the so-called Entry) in the collection
    - isEmpty - returns if the map is empty
         */
        /*
        In addition to standard operations, the map contains a set of operations responsible for returning items in the form of a different collection:
    - keySet - returns the set of keys asSet
    - values - returns all values as Collection
    - entrySet: returns the Set of key-value objects. A single pair is represented by the class [inner] (inner_classes.md) Map.Entry.
         */
//        The three common implementations of the Map interface are:  HashMap, TreeMap, andLinkedHashMap
/*
    HashMap:
        the order of pairs is not preserved
        stores information in a hash table.

    TreeMap:
        the order of pairs is preserved according to the so-called natural order of keys or according to a certain key comparator
        stores data in a red-black tree.

    LinkedHashMap:
        saves information about the order of adding individual pairs
        the implementation is based on a hash table with linked list support.
 */
        final Map<Integer, String> ageToNamesHashMap = new HashMap<>(); // initialize HashMap
        ageToNamesHashMap.put(11, "Andrew"); // adding items
        ageToNamesHashMap.put(22, "Michael");  // adding another pair
        ageToNamesHashMap.put(33, "John");  // adding a third pair to the map
        ageToNamesHashMap.remove(22);     // removing an item based on the key
        System.out.println(ageToNamesHashMap.get(11)); // displaying the value based on the key 11 -> Andrew

        System.out.println("----------");

        final Map<Integer, String> ageToNames = new LinkedHashMap<>(); // creating LinkedHashMap
        ageToNames.put(20, "Maggie");
        ageToNames.put(40, "Kate");
        ageToNames.put(30, "Anne");
        for (final Integer key : ageToNames.keySet()) { // key iteration using keySet()
            System.out.println("Key is map: " + key);     // the order of the keys is always the same -> 20, 40, 30
        }
        System.out.println();
        for (final String value : ageToNames.values()) {   // iteration over values using values()
            System.out.println("Value in map is: " + value); // the order of the values is always the same -> Maggie, Anne, Kate
        }
        System.out.println();
        for (final Map.Entry<Integer, String> ageToName : ageToNames.entrySet()) { // iteration over pairs with entrySet()
            System.out.println("Value for key  "
                    + ageToName.getKey() + " is "
                    + ageToName.getValue());
  /* the result will always be the following 3 lines, in this exact order (results from the use of LinkedHashMap)
     Value for key 20 is Maggie
     Value for key 40 is Kate
     Value for key 30 is Anne
   */
        }
        System.out.println("----------");
        final Map<Integer, Integer> numberToDigitsSum = new TreeMap<>();
        numberToDigitsSum.put(33, 6);
        numberToDigitsSum.put(19, 10);
        numberToDigitsSum.put(24, 6);
        numberToDigitsSum.forEach((key, value) -> System.out.println(key + " " + value));
        /* Items will always be listed in the same order:
         19 10
         24 6
         33 6
        */
        System.out.println("-------------------" + "\n" + "-------------------");
//      ////COMPARATORS////

        List<User> users = Arrays.asList(
                new User("Peter", 20),
                new User("John", 23));
//          OVERRIDES JAVA COMPARATOR - sorts for the first char and order is : JOHN, PETER
        Collections.sort(users, new Comparator<User>() {     //Collections.sort(users, Comparator.comparingInt(o -> (int) o.getName().charAt(0))); - lambda
            @Override
            public int compare(User o1, User o2) {
                return (int) o1.getName().charAt(0) - (int) o2.getName().charAt(0);
            }
        });
        for (final User user : users) {
            System.out.println(user.getName());
        }

        System.out.println("-------------------" + "\n" + "-------------------");

//        ////ARRAYS CLASS///
        int result = Arrays.binarySearch(new int[]{1, 2, 4, 5, 6}, 5);
        System.out.println(result); // 3

        System.out.println("----------");
//as list array
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> ints2 = Arrays.asList(5, 2, 7, 4);
//compare arrays
        int result1 = Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(result1); // 0

        int result2 = Arrays.compare(new int[]{1, 2}, new int[]{1, 2, 3});
        System.out.println(result2); // -1

        int result3 = Arrays.compare(new int[]{3, 1}, new int[]{1, 3});
        System.out.println(result3); // 1

        boolean resulta = Arrays.equals(new int[]{3, 1}, new int[]{1, 3});
        System.out.println(resulta); // false
//copy an array/part of an array
        System.out.println("----------");
        int[] original = new int[]{1, 2, 3, 4};
        int[] copiedResult = Arrays.copyOf(original, 3);
        System.out.println(Arrays.toString(copiedResult)); // [1, 2, 3]
//sort an array
        System.out.println("----------");
        int[] nos = {3, 1, 5, 4, 2};
        Arrays.sort(nos);
        System.out.println(Arrays.toString(nos)); //[1, 2, 3, 4, 5]
        System.out.println("----------");
//        if we want to find index of the first element where two arrays differ from each other
//        we can use mismatch method. Result -1 means that arrays do equal. If the return value
//        is non-negative - it is an index of the mismatched element.
        int resultA = Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(resultA); // -1

        int resultB = Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 3, 2});
        System.out.println(resultB); // 1
        System.out.println("----------");
//stream
        System.out.println(Arrays.stream(new int[]{1, 2, 3}) // IntStream
                .map(x -> x * 2)
                .sum()); // 12

        System.out.println("-------------------" + "\n" + "-------------------");

//        ///COLLECTION CLASS////
//empty
        List<String> list = Collections.emptyList();
        Map<String, Integer> map = Collections.emptyMap();
        Set<Object> set = Collections.emptySet();

//        list.add("2"); // UnsupportedOperationException - collection is immutable
//synchronized collections
        System.out.println("----------");
        List<Integer> immutableList = Collections.singletonList(1);
        Map<String, String> immutableMap = Collections.singletonMap("key", "value");
        List<String> mutableList = new ArrayList<>();
        mutableList.add("hi");
        Collections.synchronizedSet(Set.of(1, 2, 3));

        List<String> immutableWordList = Collections.unmodifiableList(mutableList);
//        immutableWordList.add("boom"); // UnsupportedOperationException
//min and max
        System.out.println("----------");
        Integer min = Collections.min(List.of(1, 2, 3));
        Integer max = Collections.max(List.of(1, 2, 3));
        Integer maxWithReverseOrder = Collections.max(List.of(1, 2, 3), Collections.reverseOrder());
        System.out.println(min + " " + max + " " + maxWithReverseOrder); // 1 3 1
//reverse
        System.out.println("----------");
        List<Integer> intsAnother = new ArrayList<>();
        intsAnother.add(1);
        intsAnother.add(2);
        intsAnother.add(3);
        Collections.reverse(intsAnother);
        intsAnother.forEach(System.out::println); // 3 2 1
//        Collections.reverse(List.of(1, 2)); // List.of(...) create immutable collection -> UnsupportedOperationException is thrown
//replace all
        System.out.println("----------");
        List<Integer> intsCaca = new ArrayList<>();
        intsCaca.add(1);
        intsCaca.add(2);
        intsCaca.add(2);
        intsCaca.add(3);
        Collections.replaceAll(intsCaca, 2, 4);
        intsCaca.forEach(System.out::println); // 1 4 4 3
//sorting
        System.out.println("----------");
        List<String> words = new LinkedList<>();
        words.add("hi");
        words.add("welcome");
        words.add("hello!");
        Collections.sort(words, Collections.reverseOrder());
        System.out.println(words); // [welcome, hi, hello!]


    }

    ///Queue////
    public interface Queue<E> extends Collection<E> {
        E element();

        boolean offer(E e);

        E peek();

        E poll();

        E remove();
    }
}
