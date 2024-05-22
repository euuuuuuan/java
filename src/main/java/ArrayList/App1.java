package ArrayList;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Honda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println();

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
