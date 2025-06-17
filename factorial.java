public class factorial {

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }
}