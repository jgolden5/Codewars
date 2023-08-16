public class Main {
    public static void main(String[] args) {
        MathEvaluator mathEvaluator = new MathEvaluator();
        String s1 = "-5 - -1 + -5 - -1 + 0";
        System.out.println("Answer = " + mathEvaluator.calculate(s1));
    }
}