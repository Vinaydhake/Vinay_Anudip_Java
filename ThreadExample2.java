// here using sleep() and interupt method () exception error was generated.


public class ThreadExample2 {
    public static void main(String[] args) {

        // First thread to calculate average of 10 numbers
        Thread avgThread = new Thread(() -> {
            int sum = 0;
            for (int i = 1; i < 11; i++) {
                sum += i;
            }
            double avg = sum / 10.0;
            System.out.println("Average of first 10 numbers is: " + avg);
        });

        // Second thread to calculate square of a number and handle interruption
        Thread squareThread = new Thread(() -> {
            try {
                System.out.println("Square thread sleeping for 2 seconds...");
                Thread.sleep(2000);  // Simulate long-running operation
                int n = 6;
                int square = n * n;
                System.out.println("Square of " + n + " is: " + square);
            } catch (InterruptedException e) {
                System.out.println("Square thread was interrupted!");
            }
        });

        // Start both threads
        avgThread.start();
        squareThread.start();

        // Interrupt squareThread after 1 second
        try {
            Thread.sleep(10000);  // Let the squareThread run a bit
            squareThread.interrupt();  // Interrupt the sleeping thread
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        // Wait for both threads to complete
        try {
            avgThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while joining!");
        }

        System.out.println("Both threads have completed execution.");
    }
}
