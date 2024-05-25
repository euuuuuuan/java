package interfaces;

interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some txt...");
    }
    public void myOtherMethod() {
        System.out.println("Some other txt...");
    }
}

class Main1 {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
/*
Note: To implement multiple interfaces,
separate them with a comma.*/