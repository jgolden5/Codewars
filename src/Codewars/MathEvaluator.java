package Codewars;

import java.util.ArrayList;
import java.util.Stack;

public class MathEvaluator {

  public double calculate(String infix) {
    ArrayList<String> infixArrayList = infixStringToArrayList(infix);
    ArrayList<String> postfixArrayList = infixToPostfixArrayList(infixArrayList);
    return rpnCalculator(postfixArrayList);
  }

  double rpnCalculator(ArrayList<String> postfixArrayList) {
    Stack<Double> operandStack = new Stack<>();
    for(String token : postfixArrayList) {
      if("*/+-".contains(token)) {
        double x, y;
        switch(token) {
          case "*":
            y = operandStack.pop();
            x = operandStack.pop();
            operandStack.push(x * y);
            break;
          case "/":
            y = operandStack.pop();
            x = operandStack.pop();
            operandStack.push(x / y);
            break;
          case "+":
            y = operandStack.pop();
            x = operandStack.isEmpty() ? 0 : operandStack.pop();
            operandStack.push(x + y);
            break;
          case "-":
            y = operandStack.pop();
            x = operandStack.isEmpty() ? 0 : operandStack.pop();
            operandStack.push(x - y);
            break;
        }
      } else {
        operandStack.push(Double.parseDouble(token));
      }
    }
    return operandStack.pop();
  }

  /**
   * loop through every element of infixArrayList
     * if !"()*\/+-".contains(currentInfix)
       * add token to postfixResult
     * else
       * while shouldPopFromOpStackToPostfixResult
         * postfixResult.add(opStack.pop())
       * opStack.push(token)
   * add any remaining elements from opStack to postfixArrayList
   * @param infixArrayList
   * @return
   */
  ArrayList<String> infixToPostfixArrayList(ArrayList<String> infixArrayList) {
    ArrayList<String> postfixResult = new ArrayList<>();
    Stack<String> opStack = new Stack<>();
    for (String token : infixArrayList) {
      if(!"()*/+-".contains(token)) {
        postfixResult.add(token);
      } else if(token.equals(")")) {
        while(!opStack.peek().equals("(")) {
          postfixResult.add(opStack.pop());
        }
        opStack.pop();
      } else {
        while(!opStack.isEmpty() && !opStack.peek().equals("(") &&
          ("*/".contains(token) && "*/".contains(opStack.peek()) || "+-".contains(token))) {
            postfixResult.add(opStack.pop());
        }
        opStack.push(token);
      }
    }
    while(!opStack.isEmpty()) {
      postfixResult.add(opStack.pop());
    }
    if(!validatePostfix(postfixResult)) {
      if(postfixResult.get(postfixResult.size() - 1).equals("-")) {
        postfixResult.remove(postfixResult.size() - 1);
        int lastIndexOfNum = -1;
        for(int i = 0; i < postfixResult.size(); i++) {
          if(!"*/+-".contains(postfixResult.get(i))) {
            lastIndexOfNum = i;
          }
        }
        String last = postfixResult.get(lastIndexOfNum);
        postfixResult.remove(lastIndexOfNum);
        postfixResult.add(lastIndexOfNum, "-" + last);
        postfixResult = infixToPostfixArrayList(postfixResult);
      }
    }
    return postfixResult;
  }

  private boolean validatePostfix(ArrayList<String> postfixResult) {
    int numCount = 0;
    int opCount = 0;
    for(String token : postfixResult) {
      if("*/+-".contains(token)) {
        opCount++;
      } else {
        numCount++;
      }
    }
    return numCount == opCount + 1;
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
  ArrayList<String> infixStringToArrayList(String infixString) {
    ArrayList<String> infixArrayList = new ArrayList<>();
    final String validNumbers = "0123456789.";
    for(int i = 0; i < infixString.length(); i++) {
      int infixArrayListLast = infixArrayList.size() - 1;
      String nextChar = String.valueOf(infixString.charAt(i));
      String prevChar = infixArrayList.size() > 0 ? String.valueOf(infixArrayList.get(infixArrayListLast).charAt(0)) : " ";
      if(validNumbers.contains(nextChar)) {
        if(validNumbers.contains(prevChar)) {
          prevChar = infixArrayList.remove(infixArrayListLast);
          nextChar = prevChar + nextChar;
        }
        infixArrayList.add(nextChar);
      } else if(!nextChar.equals(" ")) {
        infixArrayList.add(nextChar);
      }
    }
    return infixArrayList;
  }

}