package oopclasses;

public class Main {
      int x = 5;
//    int y = 3;
//    int x = 10;

// Multiple Attributes
    public static void main(String[] args) {
        Main myObj1 = new Main(); // Object1
        Main myObj2 = new Main(); // Object2
//        System.out.println(myObj.x);
        myObj2.x = 25; // x is now 25
        System.out.println(myObj1.x); // Output 5
        System.out.println(myObj2.x); // Output 25
    }
}
