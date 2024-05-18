package Polymorphism;

public class Animal { // superClass
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

    class Pig extends Animal { // subClass
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
    class Dog extends Animal { //subClass
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}

    class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound(); // print문 실행
        myPig.animalSound();
        myDog.animalSound();
    }
    }
    /*Why And When To Use "Inheritance" and "Polymorphism"?
    - It is useful for code reusability:
    reuse attributes and methods of an existing class
    when you create a new class.*/
