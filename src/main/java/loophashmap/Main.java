package loophashmap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values
        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        System.out.println();

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
