import java.util.ArrayList;
import java.util.Stack;

public class MathEvaluator {

  public double calcFromInfix(String infix) {
    String postfix = infixToPostfix(infix);
    return calcFromPostfix(postfix);
  }

  String infixToPostfix(String infix) {
    return "";
  }

  private double calcFromPostfix(String postfix) {
    return 0;
  }

}

/*tasks for calculator:
1. Addition & Subtraction (no negatives)
2. Addition & Subtraction (with negatives/double negatives)
3. Multiplication & Division (with order of operations)
4. Exponents (OOP)
5. Parentheses
*/
