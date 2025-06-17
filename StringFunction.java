public class StringFunction {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // Length of string
        System.out.println("Length: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Substring
        System.out.println("Substring (0,5): " + str.substring(0, 5));

        // Replace
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // Check if contains
        System.out.println("Contains 'Hello': " + str.contains("Hello"));

        // Character at index
        System.out.println("Char at 1: " + str.charAt(1));

        // Index of substring
        System.out.println("Index of ',': " + str.indexOf(','));
    }
}

