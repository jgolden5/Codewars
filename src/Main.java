public class Main {
    public static void main(String[] args) {
        MathEvaluator mathEvaluator = new MathEvaluator();
        //Part 1 Tests:
        System.out.println("Test 1: Positives and negatives, just addition:");

        System.out.println("1a: " + (mathEvaluator.calculate("1 + 1") == 2.0 ? "✅" : "❌"));
        System.out.println("1b: " + (mathEvaluator.calculate("1 - 1") == 0.0 ? "✅" : "❌"));
        System.out.println("1c: " + (mathEvaluator.calculate("1 + -1") == 0.0 ? "✅" : "❌"));
        System.out.println("1d: " + (mathEvaluator.calculate("1 - -1") == 2.0 ? "✅" : "❌"));

        System.out.println("1e: " + (mathEvaluator.calculate("-1 + 1") == 0.0 ? "✅" : "❌"));
        System.out.println("1f: " + (mathEvaluator.calculate("-1 - 1") == -2.0 ? "✅" : "❌"));
        System.out.println("1g: " + (mathEvaluator.calculate("-1 + -1") == -2.0 ? "✅" : "❌"));
        System.out.println("1h: " + (mathEvaluator.calculate("-1 - -1") == 0.0 ? "✅" : "❌"));

        System.out.println("1i: " + (mathEvaluator.calculate("2 + 2") == 4.0 ? "✅" : "❌"));
        System.out.println("1j: " + (mathEvaluator.calculate("4 - 4") == 0.0 ? "✅" : "❌"));
        System.out.println("1k: " + (mathEvaluator.calculate("5 + -1") == 4.0 ? "✅" : "❌"));
        System.out.println("1l: " + (mathEvaluator.calculate("6 - -3") == 9.0 ? "✅" : "❌"));

        System.out.println("1m: " + (mathEvaluator.calculate("-9 + 1") == -8.0 ? "✅" : "❌"));
        System.out.println("1n: " + (mathEvaluator.calculate("-6 - 4") == -10.0 ? "✅" : "❌"));
        System.out.println("1o: " + (mathEvaluator.calculate("-5 + -2") == -7.0 ? "✅" : "❌"));
        System.out.println("1p: " + (mathEvaluator.calculate("-2 - -7") == 5.0 ? "✅" : "❌"));


    }
}

