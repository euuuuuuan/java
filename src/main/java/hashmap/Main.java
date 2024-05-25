package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called captialCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("France"));
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
