public class If_Else {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        } else {
            System.out.println("20 is less than 18");
        }

        int x = 2;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good night.");
        }

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        }  else {
            System.out.println("Good evening.");
        }

        String result = (time < 18) ? "Good night." : "Good evening.";
        System.out.println(result);

        int doorCode = 1337;
        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door is now closed.");
        }

        int myNum = 10;
        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        int myAge = 25;
        int votingAge = 18;

        if (myAge > votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enought to vote.");
        }

        int myNumm = 5;
        if (myNumm % 2 == 0) {
            System.out.println(myNumm + " is even.");
        } else {
            System.out.println(myNumm + " is odd.");
        }
    }
}
