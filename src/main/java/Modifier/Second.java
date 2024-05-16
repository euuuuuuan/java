package Modifier;

public class Second {
    public static void main(String[] args) {
        // create an object of the Student class
        // which inherits attributes and methods from Main

        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Name: " + myObj.age);
        System.out.println("Name: " + myObj.graduationYear);
        myObj.study();
    }
}
