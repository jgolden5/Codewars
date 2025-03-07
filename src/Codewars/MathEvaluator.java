package Codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MathEvaluator {

  public double calcFromInfix(String infix) {
    ArrayList<String> infixArrayList = infixStringToArrayList(infix);
    Stack<String> postfixStack = infixArrayListToPostfixStack(infixArrayList);
    return calcFromPostfix(postfixStack);
  }

  /**
   * add all numbers up to and including both of the first highest-priority operands, followed by the highest-priority operator
   * @param infixArrayList
   * @return
   */
  Stack<String> infixArrayListToPostfixStack(ArrayList<String> infixArrayList) {
    Stack<String> postfixStack = new Stack<>();
    ArrayList<String> orderedOps = getOrderedOps(infixArrayList);
    for(int i = 0; i < infixArrayList.size(); i++) {
      String nextChar = infixArrayList.get(i);
    }
    return postfixStack;
  }

  private ArrayList<String> getOrderedOps(ArrayList<String> infixArrayList) {
    ArrayList<String> unorderedOps = getUnorderedOps(infixArrayList);
    ArrayList<String> orderedOps = unorderedOps;
    return orderedOps;
  }

  public ArrayList<String> getUnorderedOps(ArrayList<String> infixArrayList) {
    ArrayList<String> unorderedOps = new ArrayList<>();
    for(int i = 0; i < infixArrayList.size(); i++) {
      String firstCharOfNextAsString = String.valueOf(infixArrayList.get(i).charAt(0));
      if(!"0123456789.".contains(firstCharOfNextAsString)) {
        unorderedOps.add(firstCharOfNextAsString);
      }
    }
    return unorderedOps;
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

  private double calcFromPostfix(Stack<String> postfixStack) {
    return 0;
  }

}