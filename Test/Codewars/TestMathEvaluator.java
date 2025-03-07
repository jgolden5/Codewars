package Codewars;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMathEvaluator {

  public final MathEvaluator math = new MathEvaluator();
  @Test
  public void infixStringToStack() {
    //A: Test short, one-digit stacks
    Stack<String> shortStack1 = new Stack<>();
    shortStack1.push("8");
    shortStack1.push("+");
    shortStack1.push("3");
    assertEquals(shortStack1, math.infixStringToStack("8 + 3"));
    Stack<String> shortStack2 = new Stack<>();
    shortStack2.push("6");
    shortStack2.push("-");
    shortStack2.push("2");
    assertEquals(shortStack2, math.infixStringToStack("6 - 2"));
    Stack<String> shortStack3 = new Stack<>();
    shortStack3.push("9");
    shortStack3.push("/");
    shortStack3.push("3");
    assertEquals(shortStack3, math.infixStringToStack("9 / 3"));
    Stack<String> shortStack4 = new Stack<>();
    shortStack4.push("7");
    shortStack4.push("*");
    shortStack4.push("4");
    assertEquals(shortStack4, math.infixStringToStack("7 * 4"));

    //B: Test infix, not postfix yet
    Stack<String> shortStack5 = new Stack<>();
    shortStack5.push("4");
    shortStack5.push("2");
    shortStack5.push("+");
    assertNotEquals(shortStack5, math.infixStringToStack("4 + 2"));
    Stack<String> shortStack6 = new Stack<>();
    shortStack6.push("5");
    shortStack6.push("0");
    shortStack6.push("-");
    assertNotEquals(shortStack6, math.infixStringToStack("5 - 0"));

    //C: Test longer two-digit stacks
    Stack<String> twoDigitStack1 = new Stack<>();
    twoDigitStack1.push("21");
    twoDigitStack1.push("/");
    twoDigitStack1.push("7");
    twoDigitStack1.push("+");
    twoDigitStack1.push("37");
    assertEquals(twoDigitStack1, math.infixStringToStack("21 / 7 + 37"));
    Stack<String> twoDigitStack2 = new Stack<>();
    twoDigitStack2.push("9");
    twoDigitStack2.push("+");
    twoDigitStack2.push("15");
    twoDigitStack2.push("-");
    twoDigitStack2.push("1");
    twoDigitStack2.push("*");
    twoDigitStack2.push("2");
    assertEquals(twoDigitStack2, math.infixStringToStack("9 + 15 - 1 * 2"));
    Stack<String> twoDigitStack3 = new Stack<>();
    twoDigitStack3.push("20");
    twoDigitStack3.push("/");
    twoDigitStack3.push("10");
    twoDigitStack3.push("*");
    twoDigitStack3.push("11");
    twoDigitStack3.push("+");
    twoDigitStack3.push("91");
    assertEquals(twoDigitStack3, math.infixStringToStack("20 / 10 * 11 + 91"));

    //D: Test simple parentheses in stacks
    Stack<String> simpleParentheses1 = new Stack<>();
    simpleParentheses1.push("(");
    simpleParentheses1.push("9");
    simpleParentheses1.push("+");
    simpleParentheses1.push("6");
    simpleParentheses1.push(")");
    simpleParentheses1.push("*");
    simpleParentheses1.push("4");
    assertEquals(simpleParentheses1, math.infixStringToStack("(9 + 6) * 4"));
    Stack<String> simpleParentheses2 = new Stack<>();
    simpleParentheses2.push("13");
    simpleParentheses2.push("*");
    simpleParentheses2.push("(");
    simpleParentheses2.push("5");
    simpleParentheses2.push("-");
    simpleParentheses2.push("9");
    simpleParentheses2.push(")");
    simpleParentheses2.push("+");
    simpleParentheses2.push("14");
    assertEquals(simpleParentheses2, math.infixStringToStack("13 * (5 - 9) + 14"));
    Stack<String> simpleParentheses3 = new Stack<>();
    simpleParentheses3.push("14");
    simpleParentheses3.push("/");
    simpleParentheses3.push("(");
    simpleParentheses3.push("7");
    simpleParentheses3.push("+");
    simpleParentheses3.push("3");
    simpleParentheses3.push(")");
    simpleParentheses3.push("*");
    simpleParentheses3.push("6");
    simpleParentheses3.push("-");
    simpleParentheses3.push("0");
    assertEquals(simpleParentheses3, math.infixStringToStack("14 / (7 + 3) * 6 - 0"));

    //E: Test handle decimals
    Stack<String> handleDecimals1 = new Stack<>();
    handleDecimals1.push("1.1");
    handleDecimals1.push("+");
    handleDecimals1.push("2.2");
    handleDecimals1.push("/");
    handleDecimals1.push("3.3");
    handleDecimals1.push("*");
    handleDecimals1.push("4.4");
    handleDecimals1.push("-");
    handleDecimals1.push("5.5");
    assertEquals(handleDecimals1, math.infixStringToStack("1.1 + 2.2 / 3.3 * 4.4 - 5.5"));
    Stack<String> handleDecimals2 = new Stack<>();
    handleDecimals2.push("9");
    handleDecimals2.push("-");
    handleDecimals2.push("2.6");
    handleDecimals2.push("/");
    handleDecimals2.push("1.3");
    handleDecimals2.push("+");
    handleDecimals2.push("8.91");
    handleDecimals2.push("*");
    handleDecimals2.push("12");
    assertEquals(handleDecimals2, math.infixStringToStack("9 - 2.6 / 1.3 + 8.91 * 12"));
    Stack<String> handleDecimals3 = new Stack<>();
    handleDecimals3.push("31.24");
    handleDecimals3.push("-");
    handleDecimals3.push("9");
    handleDecimals3.push("*");
    handleDecimals3.push("4");
    handleDecimals3.push("/");
    handleDecimals3.push("18");
    assertEquals(handleDecimals3, math.infixStringToStack("31.24 - 9 * 4 / 18"));

    //F: Test multi-digits
    Stack<String> multidigits1 = new Stack<>();
    multidigits1.push("12");
    multidigits1.push("+");
    multidigits1.push("3456");
    multidigits1.push("-");
    multidigits1.push("7901");
    multidigits1.push("*");
    multidigits1.push("123");
    assertEquals(multidigits1, math.infixStringToStack("12 + 3456 - 7901 * 123"));
    Stack<String> multidigits2 = new Stack<>();
    multidigits2.push("1234567890");
    multidigits2.push("/");
    multidigits2.push("9876543210");
    multidigits2.push("+");
    multidigits2.push("0");
    assertEquals(multidigits2, math.infixStringToStack("1234567890 / 9876543210 + 0"));

    //G: Test questionable spaces
    Stack<String> questionableSpaces1 = new Stack<>();
    questionableSpaces1.push("1");
    questionableSpaces1.push("+");
    questionableSpaces1.push("2");
    assertEquals(questionableSpaces1, math.infixStringToStack("1      +  2"));
    Stack<String> questionableSpaces2 = new Stack<>();
    questionableSpaces2.push("3");
    questionableSpaces2.push("*");
    questionableSpaces2.push("4");
    questionableSpaces2.push("-");
    questionableSpaces2.push("8");
    questionableSpaces2.push("+");
    questionableSpaces2.push("9");
    assertEquals(questionableSpaces2, math.infixStringToStack("3 *   4 -  8    +      9"));
    Stack<String> questionableSpaces3 = new Stack<>();
    questionableSpaces3.push("9");
    questionableSpaces3.push("/");
    questionableSpaces3.push("8");
    questionableSpaces3.push("*");
    questionableSpaces3.push("7");
    questionableSpaces3.push("+");
    questionableSpaces3.push("6");
    assertEquals(questionableSpaces3, math.infixStringToStack("9 / 8 * 7 +                                         6"));

    //H: Test no spaces
    Stack<String> noSpaces1 = new Stack<>();
    noSpaces1.push("3");
    noSpaces1.push("+");
    noSpaces1.push("3");
    assertEquals(noSpaces1, math.infixStringToStack("3+3"));
    Stack<String> noSpaces2 = new Stack<>();
    noSpaces2.push("9");
    noSpaces2.push("/");
    noSpaces2.push("2");
    noSpaces2.push("+");
    noSpaces2.push("6");
    assertEquals(noSpaces2, math.infixStringToStack("9/2 +6"));
    Stack<String> noSpaces3 = new Stack<>();
    noSpaces3.push("73");
    noSpaces3.push("*");
    noSpaces3.push("643");
    noSpaces3.push("/");
    noSpaces3.push("3");
    noSpaces3.push("+");
    noSpaces3.push("2");
    noSpaces3.push("-");
    noSpaces3.push("36");
    assertEquals(noSpaces3, math.infixStringToStack("73*643/3+2   -36"));

    //I: Test minus signs
    Stack<String> minusSigns1 = new Stack<>();
    minusSigns1.push("-9");
    assertEquals(minusSigns1, math.infixStringToStack("-9"));
    Stack<String> minusSigns2 = new Stack<>();
    minusSigns2.push("9");
    minusSigns2.push("+");
    minusSigns2.push("-2");
    assertEquals(minusSigns2, math.infixStringToStack("9 + -2"));
    Stack<String> minusSigns3 = new Stack<>();
    minusSigns3.push("1");
    minusSigns3.push("-");
    minusSigns3.push("1");
    assertEquals(minusSigns3, math.infixStringToStack("1-1"));
    assertEquals(minusSigns3, math.infixStringToStack("1 -1"));
    assertEquals(minusSigns3, math.infixStringToStack("1- 1"));
    assertEquals(minusSigns3, math.infixStringToStack("1 - 1"));
    minusSigns3.pop();
    minusSigns3.push("-1");
    assertEquals(minusSigns3, math.infixStringToStack("1 - -1"));
    assertEquals(minusSigns3, math.infixStringToStack("1--1"));

    //J: Test parentheses


  }

}