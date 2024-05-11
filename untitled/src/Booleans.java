public class Booleans {
    public static void main(String[] args) {
        boolean isJavafun = true;
        boolean isFishTasty = false;
        System.out.println(isJavafun);
        System.out.println(isFishTasty);

        int x = 10;
        int y = 20;
        System.out.println(x > y);
        System.out.println(x < y);

        System.out.println(10 > 30);

        System.out.println(x == 10);
        System.out.println(10 == 15);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote!");
        }
    }
}
