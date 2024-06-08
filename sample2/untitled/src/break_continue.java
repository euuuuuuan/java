public class break_continue {
    public static void main(String[] args) {
 /*       for (int i = 0; i < 10; i++) {
            if (i == 4) {
                //break;
                continue;
            }
            System.out.println(i);
        }


        // Break in While Loop

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
*/
        /*
        // Continue in While Loop
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } */
/*
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[1]);
        int[] myNum = {10, 20, 30, 40};
*/
        /*
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Korea"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }*/
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Korea"};
        for (String i : cars) {
            System.out.println(i);
        }


    }
}
