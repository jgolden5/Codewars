package Codewars;

import java.util.ArrayList;
import java.util.Stack;

public class MathEvaluator {

  public double calcFromInfix(String infix) {
    String postfix = infixToPostfix(infix);
    return calcFromPostfix(postfix);
  }

  String infixToPostfix(String infix) {
    Stack<String> infixStack = infixStringToStack(infix);
    ArrayList<String> parenthesesSegment = new ArrayList<>();
    for(String atom : infixStack) {

    }
    return "";
  }

  /**
   * Declare all necessary variables for the following operations
   * Loop through every char in infix String
     * a) if nextChar is number (0-9 or .), then
       * if previous char was number, append nextChar to last char in stack (eg. prevChar = "12", nextChar = "3", push("123"))
       * else push nextChar to infixStack like normal
     * b) else if nextChar does not equal " ", push nextChar to infixStack
   * return resulting infixStack
   * @param infixString
   * @return infixStack
   */
  Stack<String> infixStringToStack(String infixString) {
    Stack<String> infixStack = new Stack<>();
    final String validNumbers = "0123456789.";
    for(int i = 0; i < infixString.length(); i++) {
      String nextChar = String.valueOf(infixString.charAt(i));
      String prevChar = infixStack.size() > 0 ? String.valueOf(infixStack.peek().charAt(0)) : " ";
      if(validNumbers.contains(nextChar)) {
        if(validNumbers.contains(prevChar) && infixStack.size() > 0) {
          prevChar = infixStack.pop();
          nextChar = prevChar + nextChar;
        }
        infixStack.push(nextChar);
      } else if(!nextChar.equals(" ")) {
        infixStack.push(nextChar);
      }
    }
    return infixStack;
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
