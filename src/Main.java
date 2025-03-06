import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      MathEvaluator math = new MathEvaluator();
      System.out.println(math.infixToRPN("1 + 2 * 12 - 16"));
    }
}