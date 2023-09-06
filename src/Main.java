public class Main {
    public static void main(String[] args) {
        System.out.println("Group 1: Basic factorials");
        System.out.println("1. " + (TrailingZerosOfFactorial.factorial(-2) == -1 ? "✅" : "❌"));
        System.out.println("2. " + (TrailingZerosOfFactorial.factorial(-10) == -1 ? "✅" : "❌"));
        System.out.println("3. " + (TrailingZerosOfFactorial.factorial(0) == 1 ? "✅" : "❌"));
        System.out.println("4. " + (TrailingZerosOfFactorial.factorial(1) == 1 ? "✅" : "❌"));
        System.out.println("5. " + (TrailingZerosOfFactorial.factorial(2) == 2 ? "✅" : "❌"));
        System.out.println("6. " + (TrailingZerosOfFactorial.factorial(3) == 6 ? "✅" : "❌"));
        System.out.println("7. " + (TrailingZerosOfFactorial.factorial(4) == 24 ? "✅" : "❌"));
        System.out.println("8. " + (TrailingZerosOfFactorial.factorial(5) == 120 ? "✅" : "❌"));
        System.out.println("9. " + (TrailingZerosOfFactorial.factorial(6) == 720 ? "✅" : "❌"));
        System.out.println("10. " + (TrailingZerosOfFactorial.factorial(7) == 5040 ? "✅" : "❌"));
        System.out.println("11. " + (TrailingZerosOfFactorial.factorial(8) == 40320 ? "✅" : "❌"));
        System.out.println("12. " + (TrailingZerosOfFactorial.factorial(9) == 362880 ? "✅" : "❌"));
        System.out.println("13. " + (TrailingZerosOfFactorial.factorial(10) == 3628800 ? "✅" : "❌"));
        System.out.println("14. " + (TrailingZerosOfFactorial.factorial(11) == 39916800 ? "✅" : "❌"));
        System.out.println("15. " + (TrailingZerosOfFactorial.factorial(12) == 479001600 ? "✅" : "❌"));
    }
}
