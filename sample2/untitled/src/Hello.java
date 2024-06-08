public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.random());
        System.out.println(Math.random());
        //returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum); //0-100 random number
    }
}
