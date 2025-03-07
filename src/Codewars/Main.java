package Codewars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      MathEvaluator math = new MathEvaluator();
      ArrayList<String> testInfixAL = new ArrayList<>();
      testInfixAL.add("1");
      testInfixAL.add("+");
      testInfixAL.add("2");
      testInfixAL.add("*");
      testInfixAL.add("3");
      testInfixAL.add("/");
      testInfixAL.add("-");
      testInfixAL.add("4");
      testInfixAL.add("+");
      testInfixAL.add("(");
      testInfixAL.add("5");
      testInfixAL.add("-");
      testInfixAL.add("6");
      testInfixAL.add(")");
      System.out.println(math.getUnorderedOps(testInfixAL));
      System.out.println("prove it works here (once it works): ");
    }
}