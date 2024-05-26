package threads;

public class Fourth extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Fourth thread = new Fourth();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    // isAlive() method to prevent concurrency problems

    public void run() {
        amount++;
    }

}
