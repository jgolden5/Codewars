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

  Stack<String> infixStringToStack(String infixString) {
    Stack<String> infixStack = new Stack<>();
    final String possibleNums = "0123456789.";
    boolean nextNumberShouldIncludePreviousMinus = false;
    boolean shouldRemoveNextParenthesis = false;
    for(int i = 0; i < infixString.length(); i++) {
      String nextChar = String.valueOf(infixString.charAt(i));
      boolean nextCharIsNumber = possibleNums.contains(nextChar);
      boolean previousCharWasNumber = !infixStack.isEmpty() && possibleNums.contains(infixStack.peek().substring(0, 1));
      boolean nextCharIsMinus = nextChar.equals("-");
      if(nextCharIsNumber && (previousCharWasNumber || nextNumberShouldIncludePreviousMinus)) {
        String poppedNum = infixStack.pop();
        if(poppedNum.equals("(")) {
          shouldRemoveNextParenthesis = true;
          poppedNum = infixStack.pop();
        }
        String poppedNumWithNextChar = poppedNum + nextChar;
        infixStack.push(poppedNumWithNextChar);
        nextNumberShouldIncludePreviousMinus = false;
      } else if(!nextChar.equals(" ")) {
        if(shouldRemoveNextParenthesis && nextChar.equals(")")) {
          shouldRemoveNextParenthesis = false;
        } else {
          infixStack.push(nextChar);
          boolean onlyElementInStackIsMinus = infixStack.size() == 1 && infixStack.peek().equals("-");
          if (!previousCharWasNumber && nextCharIsMinus || onlyElementInStackIsMinus) {
            if(nextNumberShouldIncludePreviousMinus) {
              nextNumberShouldIncludePreviousMinus = false;
              int minusesRemoved = 0;
              while(minusesRemoved < 2) {
                String elementRemoved = infixStack.pop();
                if(elementRemoved.equals("-")) {
                  minusesRemoved++;
                } else if(elementRemoved.equals("(")) {
                  shouldRemoveNextParenthesis = true;
                }
              }
            } else {
              nextNumberShouldIncludePreviousMinus = true;
            }
          }
        }
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
