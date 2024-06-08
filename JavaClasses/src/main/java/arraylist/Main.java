package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Honda");

        System.out.println(cars);

//        cars.set(1, "Opel");
        // To modify an element,
        // use the set() method and refer to the index number:

        cars.remove(0);
        // To remove an element

//        cars.clear(); // To remove all
        System.out.println(cars.size());
        // To find out how many elements an ArrayList have

        System.out.println(cars.get(1));
        // To access an element in the ArrayList,
        // use the get() method and refer to the index number:



    }
}
