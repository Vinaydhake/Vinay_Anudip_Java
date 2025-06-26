public class UnaryExample {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Unary Operators Example:");
        System.out.println("Initial a: " + a); // 5

        System.out.println("++a: " + (++a));   // 6 (pre-increment)
        System.out.println("a++: " + (a++));   // 6 (post-increment, then a becomes 7)
        System.out.println("After a++: " + a); // 7

        System.out.println("--a: " + (--a));   // 6 (pre-decrement)
        System.out.println("a--: " + (a--));   // 6 (post-decrement, then a becomes 5)
        System.out.println("After a--: " + a); // 5

        boolean flag = true;
        System.out.println("!flag: " + (!flag)); // false (logical NOT)
    }
}
