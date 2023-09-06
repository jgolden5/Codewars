public class TrailingZerosOfFactorial {
    public static int factorial(int n) {
        if(n < 0) {
            System.out.println("n is negative, therefore factorial is undefined");
            return -1;
        } else if(n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
    public static int countDigits(int n) {
        return n >= 0 ? String.valueOf(factorial(n)).length() : 0;
    }
}
