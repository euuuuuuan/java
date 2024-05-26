package threads;

public class Third extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Third thread = new Third();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
    // Concurrency problems occurs.
}
