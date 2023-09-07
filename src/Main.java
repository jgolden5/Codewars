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

        System.out.println("\nGroup 2: number of digits of basic factorials");
        System.out.println("1. " + (TrailingZerosOfFactorial.countDigits(-2) == 0 ? "✅" : "❌"));
        System.out.println("2. " + (TrailingZerosOfFactorial.countDigits(-10) == 0 ? "✅" : "❌"));
        System.out.println("3. " + (TrailingZerosOfFactorial.countDigits(0) == 1 ? "✅" : "❌"));
        System.out.println("4. " + (TrailingZerosOfFactorial.countDigits(1) == 1 ? "✅" : "❌"));
        System.out.println("5. " + (TrailingZerosOfFactorial.countDigits(2) == 1 ? "✅" : "❌"));
        System.out.println("6. " + (TrailingZerosOfFactorial.countDigits(3) == 1 ? "✅" : "❌"));
        System.out.println("7. " + (TrailingZerosOfFactorial.countDigits(4) == 2 ? "✅" : "❌"));
        System.out.println("8. " + (TrailingZerosOfFactorial.countDigits(5) == 3 ? "✅" : "❌"));
        System.out.println("9. " + (TrailingZerosOfFactorial.countDigits(6) == 3 ? "✅" : "❌"));
        System.out.println("10. " + (TrailingZerosOfFactorial.countDigits(7) == 4 ? "✅" : "❌"));
        System.out.println("11. " + (TrailingZerosOfFactorial.countDigits(8) == 5 ? "✅" : "❌"));
        System.out.println("12. " + (TrailingZerosOfFactorial.countDigits(9) == 6 ? "✅" : "❌"));
        System.out.println("13. " + (TrailingZerosOfFactorial.countDigits(10) == 7 ? "✅" : "❌"));
        System.out.println("14. " + (TrailingZerosOfFactorial.countDigits(11) == 8 ? "✅" : "❌"));
        System.out.println("15. " + (TrailingZerosOfFactorial.countDigits(12) == 9 ? "✅" : "❌"));

        System.out.println("\nGroup 3: trailing zeros");
        System.out.println("1. " + (TrailingZerosOfFactorial.zeros(0) == 0 ? "✅" : "❌"));
        System.out.println("2. " + (TrailingZerosOfFactorial.zeros(1) == 0 ? "✅" : "❌"));
        System.out.println("3. " + (TrailingZerosOfFactorial.zeros(5) == 1 ? "✅" : "❌"));
        System.out.println("4. " + (TrailingZerosOfFactorial.zeros(10) == 2 ? "✅" : "❌"));
        System.out.println("5. " + (TrailingZerosOfFactorial.zeros(12) == 2 ? "✅" : "❌"));
        System.out.println("6. " + (TrailingZerosOfFactorial.zeros(20) == 4 ? "✅" : "❌"));
        System.out.println("7. " + (TrailingZerosOfFactorial.zeros(25) == 6 ? "✅" : "❌"));
        System.out.println("8. " + (TrailingZerosOfFactorial.zeros(50) == 12 ? "✅" : "❌"));
        System.out.println("9. " + (TrailingZerosOfFactorial.zeros(76) == 18 ? "✅" : "❌"));
        System.out.println("10. " + (TrailingZerosOfFactorial.zeros(100) == 24 ? "✅" : "❌"));
        System.out.println("11. " + (TrailingZerosOfFactorial.zeros(120) == 28 ? "✅" : "❌"));
        System.out.println("12. " + (TrailingZerosOfFactorial.zeros(124) == 28 ? "✅" : "❌"));
        System.out.println("13. " + (TrailingZerosOfFactorial.zeros(125) == 31 ? "✅" : "❌"));
        System.out.println("14. " + (TrailingZerosOfFactorial.zeros(200) == 49 ? "✅" : "❌"));
        System.out.println("15. " + (TrailingZerosOfFactorial.zeros(625) == 156 ? "✅" : "❌"));

    }
}
