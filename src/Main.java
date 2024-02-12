public class Main {
    public static void main(String[] args) {

        MathEvaluator m = new MathEvaluator();
        String s1 = m.infixToRPN("3 + 4");

        System.out.println(s1 == "3 4 +" ? "✅" : "❌");

    }
}