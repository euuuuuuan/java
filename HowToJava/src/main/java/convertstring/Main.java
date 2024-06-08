package convertstring;

public class Main {
    public static void main(String[] args) {


        // Create a string
        String myStr = "Hello";

        // Convert the string to a char array
        char[] myArr = myStr.toCharArray();

        // Print the first element of the array
        System.out.println(myArr[0]);

        // Print array elements
        for (char i : myArr) {
            System.out.println(i);
        }
    }
}
