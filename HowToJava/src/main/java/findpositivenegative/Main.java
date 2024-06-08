package findpositivenegative;

public class Main {
    public static void main(String[] args) {
       int myNum = 10;
       // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number");
        } else {
            System.out.println("The value is zero");
        }
    }
}
