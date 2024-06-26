package inheritance;

public class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    public void honk() {             // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang"; // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class)
        // and the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
/*Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes
and methods of an existing class when you create a new class.*/