import java.util.ArrayList;
import java.util.Arrays;

public class MathEvaluator {
    public double calculate(String expression) {
        String[] arrExpression = expression.replaceAll(" ", "").split("");
        ArrayList<Double> operandList = new ArrayList<>();
        ArrayList<String> operatorList = new ArrayList<>();
        System.out.println(Arrays.toString(arrExpression));
        //1: Set up Lists
        boolean lastElementAddedWasNumber = false;
        boolean nextNumberShouldBeNegative = false;
        for(int i = 0; i < arrExpression.length; i++) {
            if("01234567890".contains(arrExpression[i])) {
                if(nextNumberShouldBeNegative) {
                    operandList.add(-1 * Double.valueOf(arrExpression[i]));
                    nextNumberShouldBeNegative = false;
                } else {
                    operandList.add(Double.valueOf(arrExpression[i]));
                }
                lastElementAddedWasNumber = true;
            } else if("+-".contains(arrExpression[i])) {
                if(lastElementAddedWasNumber) {
                    operatorList.add(arrExpression[i]);
                } else {
                    nextNumberShouldBeNegative = true;
                }
                lastElementAddedWasNumber = false;
            }
        }
        double total = operandList.get(0);

        System.out.println("Operand List equals = " + operandList);
        System.out.println("Operator List equals = " + operatorList);

        //2: Calculate first 2 operands based on first operator
        for(int i = 1; i < operandList.size(); i++) {
            switch (operatorList.get(i - 1)) {
                case "+":
                    total += operandList.get(i);
                    break;
                case "-":
                    total -= operandList.get(i);
                    break;
                default:
                    System.out.println("Something isn't working right");
            }
        }
        return total;
//        return arrExpression.length > 3 ? calculate(arrExpression.toString()) : total;
    }
}

/*tasks for calculator:
1. Addition & Subtraction (no negatives)
2. Addition & Subtraction (with negatives/double negatives)
3. Multiplication & Division (with order of operations)
4. Exponents (OOP)
5. Parentheses
*/
