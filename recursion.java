public class recursion {
    public static int factorial(int a){
        if(a == 0 || a == 1){
            return 1;
        }else {
            return a * factorial(a - 1);
        }
    }

    public static void main(String[] args) {
        int result;
        result = factorial(10);
        System.out.println("Factorial of 10 is " + result);
    }
}
