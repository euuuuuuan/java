package userinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
//        System.out.println("Enter uersname");
//
//        String userName = myObj.nextLine(); // Read user input
//        System.out.println("Username is " + userName); // Output user

        System.out.println("Enter name, age and salary: ");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}
