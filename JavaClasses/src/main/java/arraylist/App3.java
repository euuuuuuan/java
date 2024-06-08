package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class App3 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Ford");
        Collections.sort(cars); // Sort cars

        for (String i : cars) {
            System.out.println(i);

        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers); // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
            System.out.println(i+1);
        }
    }
}
