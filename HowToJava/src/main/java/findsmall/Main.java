package findsmall;

public class Main {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Create a 'lowest age' varaible and assign the first array elements
        int lowestAge = ages[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            // age = 0 , 0 < 8까지 for문 실행
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
                // 처음 lowestAge 는 20.
                // 첫번째는 20 > 20이므로 false
                // 다시 for문으로 올라감.
                // 둘째는 20 > 22 false
                // 다시 for문으로 올라감.
                // 셋째는 18 > 20 true
                // lowestAge 는 18이 됨.
                // .
                // .
                // .
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }
        System.out.println("Lowest age: " + lowestAge);
    }
}
