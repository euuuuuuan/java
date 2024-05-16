package Constructors;

public class Main {
    int x; // Create a class attribute

    // Create a class constructor for the Main class
    public Main(int y) {
//        x = 5; // Set the initial value for the class attribute x
        x = y;
        boolean isTrue = x == y;
        System.out.println("x and y is same: " + isTrue);
    }
    // Constructor Parameters
    public static void main(String[] args) {
        Main myObj = new Main(5); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}
