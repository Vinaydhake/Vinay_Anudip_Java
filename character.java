public class character {

    public static void main(String[] args) {

        char ch1 = '5';
        char ch2 = 'A';
        char ch3 = 'a';

        // Check if ch1 is a digit
        System.out.println("Is '" + ch1 + "' a digit? " + Character.isDigit(ch1));
        // Check if ch2 is a letter
        System.out.println("Is '" + ch2 + "' a letter? " + Character.isLetter(ch2));
        // Convert ch3 to uppercase
        char upper = Character.toUpperCase(ch3);
        System.out.println("Uppercase of '" + ch3 + "' is: " + upper);
    }
}
