public class Loop {
    public static void main(String[] args) {
 /*       int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
*/
        /*
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
        */
/*
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
*/
        /*
        for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        } */
        /*
        for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:
         */


        // Outer loop
        for (int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i); // Excutes 2 tiems

            // Inner loop
            for (int j = 1; j <= 3; j++){
                System.out.println("Inner: " + j); // Excutes 6 times (2 * 3)
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars){
            System.out.println(i);
        }
    }
}
