public class maths {
    public static void main(String[] args) {
        double number = 16.0;

        // Square root
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + sqrt);

        // Power
        double power = Math.pow(number, 2);
        System.out.println(number + " raised to the power 2 is " + power);

        // Sine
        double radians = Math.toRadians(30);
        double sine = Math.sin(radians);
        System.out.println("Sine of 30 degrees is " + sine);

        // Absolute value
        double negative = -25.5;
        double absValue = Math.abs(negative);
        System.out.println("Absolute value of " + negative + " is " + absValue);

        // Maximum
        double max = Math.max(10, 20);
        System.out.println("Maximum of 10 and 20 is " + max);
    }
}
