package Codewars;

import java.util.ArrayList;
import java.util.Stack;

public class MathEvaluator {

  public double calculate(String infix) {
    ArrayList<String> infixArrayList = infixStringToArrayList(infix);
    ArrayList<String> postfixArrayList = infixToPostfixArrayList(infixArrayList);
    ArrayList<String> cleanPostfixArrayList = cleanPostfixArrayOneSegmentAtATime(infixArrayList);
    return rpnCalculator(cleanPostfixArrayList);
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

  ArrayList<String> cleanPostfixArrayOneSegmentAtATime(ArrayList<String> postfixArrayList) {
    ArrayList<String> cleanPostfixArrayList = new ArrayList<>();
    ArrayList<String> currentSegment = new ArrayList<>();
    for(int i = 0; i < postfixArrayList.size(); i++) {
      boolean currentSegmentIsComplete = false;
      if(currentSegmentIsComplete) {
        cleanPostfixArrayList.addAll(removeExtraMinusesFromSegment(currentSegment));
      }
    }
    return cleanPostfixArrayList;
  }

  ArrayList<String> removeExtraMinusesFromSegment(ArrayList<String> postfixSegment) {
    ArrayList<String> cleanPostfixSegment = new ArrayList<>();
    if(postfixSegment.get(1).equals("-")) {
      String firstInSegment = postfixSegment.get(0);
      String cleanFirst = firstInSegment.charAt(0) == '-' ? firstInSegment.substring(1) : "-" + firstInSegment;
      cleanPostfixSegment.add(cleanFirst);
    } else if("*/+".contains(postfixSegment.get(1))) {
      cleanPostfixSegment.add(postfixSegment.get(0));
      cleanPostfixSegment.add(postfixSegment.get(2));
      cleanPostfixSegment.add(postfixSegment.get(1));
    }
    return cleanPostfixSegment;
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
    return postfixResult;
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