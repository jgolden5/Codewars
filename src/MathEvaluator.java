import java.util.Stack;

public class MathEvaluator {
    public double calculate(String expression) {
        String expressionInRPN = infixToRPN(expression);
        double result = evaluateRPN(expressionInRPN);
        return result;
    }

    public String infixToRPN(String infixExpression) {
        String rpnExpression = "";
        String[] infixArr = infixExpression.replaceAll("\\s+","").split("");
        String operators = "";
        String operands = "";
        for(String element : infixArr) {
            
        }
        return rpnExpression;
    }

    private double evaluateRPN(String expr) {
        var stack = new Stack<Double>();
        for(String element : expr.split(" ")) {
            switch (element) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(-stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> stack.push(1 / stack.pop() * stack.pop());
                default -> stack.push(element.isEmpty() ? 0 : Double.parseDouble(element));
            }
        }
        return stack.pop();
    }

}

/*tasks for calculator:
1. Addition & Subtraction (no negatives)
2. Addition & Subtraction (with negatives/double negatives)
3. Multiplication & Division (with order of operations)
4. Exponents (OOP)
5. Parentheses
*/
