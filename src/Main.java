public class Main {
    public static void main(String[] args) {

        MathEvaluator m = new MathEvaluator();
        String s1 = m.infixToRPN("3 + 4");
        String s2 = m.infixToRPN("4 - 6");

        System.out.println(s1.equals("3.0 4.0 +") ? "✅" : "❌");
        System.out.println(s2.equals("4.0 6.0 -") ? "✅" : "❌");

    }
}