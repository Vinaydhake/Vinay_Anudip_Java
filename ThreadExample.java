//// WAP to create two threds, 
/// one finding avg of 10 numbers & other finding square of a number


public class ThreadExample {
    public static void main(String[] args) {

        // First thread to calculate average of 10 numbers
        Thread avgThread = new Thread(() -> {
        
            int sum = 0;
            for (int i=1;i<11;i++) {
                sum = sum + i;
            }
            double avg = sum / 10.00;
            System.out.println("Average of first 10 numbers is: " + avg);
        });

        // Second thread to calculate square of a number
        Thread squareThread = new Thread(() -> {
            int n = 6;
            int square = n * n;
            System.out.println("Square of " + n + " is: " + square);
        });

        // Start both threads
        avgThread.start();
        squareThread.start();

        // Optional: wait for both threads to finish
        try {
            avgThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have completed execution.");
    }
}
