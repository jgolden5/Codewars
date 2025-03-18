package Codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestMathEvaluator {

  public final MathEvaluator math = new MathEvaluator();

  @Test
  public void infixStringToArrayList() {
    //A: Test short, one-digit stacks
    ArrayList<String> shortArrayList1 = new ArrayList<>();
    shortArrayList1.add("8");
    shortArrayList1.add("+");
    shortArrayList1.add("3");
    assertEquals(shortArrayList1, math.infixStringToArrayList("8 + 3"));
    ArrayList<String> shortArrayList2 = new ArrayList<>();
    shortArrayList2.add("6");
    shortArrayList2.add("-");
    shortArrayList2.add("2");
    assertEquals(shortArrayList2, math.infixStringToArrayList("6 - 2"));
    ArrayList<String> shortArrayList3 = new ArrayList<>();
    shortArrayList3.add("9");
    shortArrayList3.add("/");
    shortArrayList3.add("3");
    assertEquals(shortArrayList3, math.infixStringToArrayList("9 / 3"));
    ArrayList<String> shortArrayList4 = new ArrayList<>();
    shortArrayList4.add("7");
    shortArrayList4.add("*");
    shortArrayList4.add("4");
    assertEquals(shortArrayList4, math.infixStringToArrayList("7 * 4"));

    //B: Test infix, not postfix yet
    ArrayList<String> shortArrayList5 = new ArrayList<>();
    shortArrayList5.add("4");
    shortArrayList5.add("2");
    shortArrayList5.add("+");
    assertNotEquals(shortArrayList5, math.infixStringToArrayList("4 + 2"));
    ArrayList<String> shortArrayList6 = new ArrayList<>();
    shortArrayList6.add("5");
    shortArrayList6.add("0");
    shortArrayList6.add("-");
    assertNotEquals(shortArrayList6, math.infixStringToArrayList("5 - 0"));

    //C: Test longer two-digit stacks
    ArrayList<String> twoDigitArrayList1 = new ArrayList<>();
    twoDigitArrayList1.add("21");
    twoDigitArrayList1.add("/");
    twoDigitArrayList1.add("7");
    twoDigitArrayList1.add("+");
    twoDigitArrayList1.add("37");
    assertEquals(twoDigitArrayList1, math.infixStringToArrayList("21 / 7 + 37"));
    ArrayList<String> twoDigitArrayList2 = new ArrayList<>();
    twoDigitArrayList2.add("9");
    twoDigitArrayList2.add("+");
    twoDigitArrayList2.add("15");
    twoDigitArrayList2.add("-");
    twoDigitArrayList2.add("1");
    twoDigitArrayList2.add("*");
    twoDigitArrayList2.add("2");
    assertEquals(twoDigitArrayList2, math.infixStringToArrayList("9 + 15 - 1 * 2"));
    ArrayList<String> twoDigitArrayList3 = new ArrayList<>();
    twoDigitArrayList3.add("20");
    twoDigitArrayList3.add("/");
    twoDigitArrayList3.add("10");
    twoDigitArrayList3.add("*");
    twoDigitArrayList3.add("11");
    twoDigitArrayList3.add("+");
    twoDigitArrayList3.add("91");
    assertEquals(twoDigitArrayList3, math.infixStringToArrayList("20 / 10 * 11 + 91"));

    //D: Test simple parentheses in stacks
    ArrayList<String> simpleParentheses1 = new ArrayList<>();
    simpleParentheses1.add("(");
    simpleParentheses1.add("9");
    simpleParentheses1.add("+");
    simpleParentheses1.add("6");
    simpleParentheses1.add(")");
    simpleParentheses1.add("*");
    simpleParentheses1.add("4");
    assertEquals(simpleParentheses1, math.infixStringToArrayList("(9 + 6) * 4"));
    ArrayList<String> simpleParentheses2 = new ArrayList<>();
    simpleParentheses2.add("13");
    simpleParentheses2.add("*");
    simpleParentheses2.add("(");
    simpleParentheses2.add("5");
    simpleParentheses2.add("-");
    simpleParentheses2.add("9");
    simpleParentheses2.add(")");
    simpleParentheses2.add("+");
    simpleParentheses2.add("14");
    assertEquals(simpleParentheses2, math.infixStringToArrayList("13 * (5 - 9) + 14"));
    ArrayList<String> simpleParentheses3 = new ArrayList<>();
    simpleParentheses3.add("14");
    simpleParentheses3.add("/");
    simpleParentheses3.add("(");
    simpleParentheses3.add("7");
    simpleParentheses3.add("+");
    simpleParentheses3.add("3");
    simpleParentheses3.add(")");
    simpleParentheses3.add("*");
    simpleParentheses3.add("6");
    simpleParentheses3.add("-");
    simpleParentheses3.add("0");
    assertEquals(simpleParentheses3, math.infixStringToArrayList("14 / (7 + 3) * 6 - 0"));

    //E: Test handle decimals
    ArrayList<String> handleDecimals1 = new ArrayList<>();
    handleDecimals1.add("1.1");
    handleDecimals1.add("+");
    handleDecimals1.add("2.2");
    handleDecimals1.add("/");
    handleDecimals1.add("3.3");
    handleDecimals1.add("*");
    handleDecimals1.add("4.4");
    handleDecimals1.add("-");
    handleDecimals1.add("5.5");
    assertEquals(handleDecimals1, math.infixStringToArrayList("1.1 + 2.2 / 3.3 * 4.4 - 5.5"));
    ArrayList<String> handleDecimals2 = new ArrayList<>();
    handleDecimals2.add("9");
    handleDecimals2.add("-");
    handleDecimals2.add("2.6");
    handleDecimals2.add("/");
    handleDecimals2.add("1.3");
    handleDecimals2.add("+");
    handleDecimals2.add("8.91");
    handleDecimals2.add("*");
    handleDecimals2.add("12");
    assertEquals(handleDecimals2, math.infixStringToArrayList("9 - 2.6 / 1.3 + 8.91 * 12"));
    ArrayList<String> handleDecimals3 = new ArrayList<>();
    handleDecimals3.add("31.24");
    handleDecimals3.add("-");
    handleDecimals3.add("9");
    handleDecimals3.add("*");
    handleDecimals3.add("4");
    handleDecimals3.add("/");
    handleDecimals3.add("18");
    assertEquals(handleDecimals3, math.infixStringToArrayList("31.24 - 9 * 4 / 18"));

    //F: Test multi-digits
    ArrayList<String> multidigits1 = new ArrayList<>();
    multidigits1.add("12");
    multidigits1.add("+");
    multidigits1.add("3456");
    multidigits1.add("-");
    multidigits1.add("7901");
    multidigits1.add("*");
    multidigits1.add("123");
    assertEquals(multidigits1, math.infixStringToArrayList("12 + 3456 - 7901 * 123"));
    ArrayList<String> multidigits2 = new ArrayList<>();
    multidigits2.add("1234567890");
    multidigits2.add("/");
    multidigits2.add("9876543210");
    multidigits2.add("+");
    multidigits2.add("0");
    assertEquals(multidigits2, math.infixStringToArrayList("1234567890 / 9876543210 + 0"));

    //G: Test questionable spaces
    ArrayList<String> questionableSpaces1 = new ArrayList<>();
    questionableSpaces1.add("1");
    questionableSpaces1.add("+");
    questionableSpaces1.add("2");
    assertEquals(questionableSpaces1, math.infixStringToArrayList("1      +  2"));
    ArrayList<String> questionableSpaces2 = new ArrayList<>();
    questionableSpaces2.add("3");
    questionableSpaces2.add("*");
    questionableSpaces2.add("4");
    questionableSpaces2.add("-");
    questionableSpaces2.add("8");
    questionableSpaces2.add("+");
    questionableSpaces2.add("9");
    assertEquals(questionableSpaces2, math.infixStringToArrayList("3 *   4 -  8    +      9"));
    ArrayList<String> questionableSpaces3 = new ArrayList<>();
    questionableSpaces3.add("9");
    questionableSpaces3.add("/");
    questionableSpaces3.add("8");
    questionableSpaces3.add("*");
    questionableSpaces3.add("7");
    questionableSpaces3.add("+");
    questionableSpaces3.add("6");
    assertEquals(questionableSpaces3, math.infixStringToArrayList("9 / 8 * 7 +                                         6"));

    //H: Test no spaces
    ArrayList<String> noSpaces1 = new ArrayList<>();
    noSpaces1.add("3");
    noSpaces1.add("+");
    noSpaces1.add("3");
    assertEquals(noSpaces1, math.infixStringToArrayList("3+3"));
    ArrayList<String> noSpaces2 = new ArrayList<>();
    noSpaces2.add("9");
    noSpaces2.add("/");
    noSpaces2.add("2");
    noSpaces2.add("+");
    noSpaces2.add("6");
    assertEquals(noSpaces2, math.infixStringToArrayList("9/2 +6"));
    ArrayList<String> noSpaces3 = new ArrayList<>();
    noSpaces3.add("73");
    noSpaces3.add("*");
    noSpaces3.add("643");
    noSpaces3.add("/");
    noSpaces3.add("3");
    noSpaces3.add("+");
    noSpaces3.add("2");
    noSpaces3.add("-");
    noSpaces3.add("36");
    assertEquals(noSpaces3, math.infixStringToArrayList("73*643/3+2   -36"));

    //I: Test minus signs
    ArrayList<String> minusSigns1 = new ArrayList<>();
    minusSigns1.add("-");
    minusSigns1.add("9");
    assertEquals(minusSigns1, math.infixStringToArrayList("-9"));
    ArrayList<String> minusSigns2 = new ArrayList<>();
    minusSigns2.add("9");
    minusSigns2.add("+");
    minusSigns2.add("-");
    minusSigns2.add("2");
    assertEquals(minusSigns2, math.infixStringToArrayList("9 + -2"));
    ArrayList<String> minusSigns3 = new ArrayList<>();
    minusSigns3.add("1");
    minusSigns3.add("-");
    minusSigns3.add("1");
    assertEquals(minusSigns3, math.infixStringToArrayList("1-1"));
    assertEquals(minusSigns3, math.infixStringToArrayList("1 -1"));
    assertEquals(minusSigns3, math.infixStringToArrayList("1- 1"));
    assertEquals(minusSigns3, math.infixStringToArrayList("1 - 1"));
    minusSigns3.remove(minusSigns3.size() - 1);
    minusSigns3.add("-");
    minusSigns3.add("1");
    assertEquals(minusSigns3, math.infixStringToArrayList("1 - -1"));
    assertEquals(minusSigns3, math.infixStringToArrayList("1--1"));
    ArrayList<String> minusSigns4 = new ArrayList<>();
    minusSigns4.add("6");
    minusSigns4.add("+");
    minusSigns4.add("-");
    minusSigns4.add("(");
    minusSigns4.add("4");
    minusSigns4.add(")");
    assertEquals(minusSigns4, math.infixStringToArrayList("6 + -(4)"));
    ArrayList<String> minusSigns5 = new ArrayList<>();
    minusSigns5.add("6");
    minusSigns5.add("+");
    minusSigns5.add("-");
    minusSigns5.add("(");
    minusSigns5.add("-");
    minusSigns5.add("4");
    minusSigns5.add(")");
    assertEquals(minusSigns5, math.infixStringToArrayList("6 + -( -4)"));
    ArrayList<String> minusSigns6 = new ArrayList<>();
    minusSigns6.add("12");
    minusSigns6.add("*");
    minusSigns6.add("123");
    minusSigns6.add("/");
    minusSigns6.add("-");
    minusSigns6.add("(");
    minusSigns6.add("-");
    minusSigns6.add("5");
    minusSigns6.add("+");
    minusSigns6.add("2");
    minusSigns6.add(")");
    assertEquals(minusSigns6, math.infixStringToArrayList("12* 123/-(-5 + 2)"));
    ArrayList<String> minusSigns7 = new ArrayList<>();
    minusSigns7.add("-");
    minusSigns7.add("(");
    minusSigns7.add("1");
    minusSigns7.add("-");
    minusSigns7.add("2");
    minusSigns7.add(")");
    minusSigns7.add("+");
    minusSigns7.add("-");
    minusSigns7.add("(");
    minusSigns7.add("-");
    minusSigns7.add("(");
    minusSigns7.add("-");
    minusSigns7.add("(");
    minusSigns7.add("-");
    minusSigns7.add("4");
    minusSigns7.add(")");
    minusSigns7.add(")");
    minusSigns7.add(")");
    assertEquals(minusSigns7, math.infixStringToArrayList("-(1 - 2) + -(-(-(-4)))"));

    //J: Advanced tests
    ArrayList<String> advanced1 = new ArrayList<>();
    advanced1.add("123.45");
    advanced1.add("*");
    advanced1.add("(");
    advanced1.add("678.90");
    advanced1.add("/");
    advanced1.add("(");
    advanced1.add("-");
    advanced1.add("2.5");
    advanced1.add("+");
    advanced1.add("11.5");
    advanced1.add(")");
    advanced1.add("-");
    advanced1.add("(");
    advanced1.add("80");
    advanced1.add("-");
    advanced1.add("19");
    advanced1.add(")");
    advanced1.add("*");
    advanced1.add("33.25");
    advanced1.add(")");
    advanced1.add("/");
    advanced1.add("20");
    advanced1.add("+");
    advanced1.add("11");
    assertEquals(advanced1, math.infixStringToArrayList("123.45*(678.90 / (-2.5+ 11.5)-(80 -19) *33.25) / 20 + 11"));
    ArrayList<String> advanced2 = new ArrayList<>();
    advanced2.add("(");
    advanced2.add("-");
    advanced2.add("2.5");
    advanced2.add("+");
    advanced2.add("11.5");
    advanced2.add(")");
    advanced2.add("-");
    advanced2.add("(");
    advanced2.add("(");
    advanced2.add("(");
    advanced2.add("80");
    advanced2.add("-");
    advanced2.add("(");
    advanced2.add("19");
    advanced2.add(")");
    advanced2.add(")");
    advanced2.add(")");
    advanced2.add("*");
    advanced2.add("33.25");
    advanced2.add(")");
    advanced2.add(")");
    advanced2.add("/");
    advanced2.add("4");
    advanced2.add("*");
    advanced2.add("0");
    assertEquals(advanced2, math.infixStringToArrayList("(-2.5+ 11.5)-(((80 -(19))) *33.25))       /4*     0"));
  }

  @Test
  public void fixInfixArrayListMinuses() {
    ArrayList<String> beforeSimple1 = new ArrayList<>();
    beforeSimple1.add("-");
    beforeSimple1.add("2");
    beforeSimple1.add("-");
    beforeSimple1.add("3");
    ArrayList<String> afterSimple1 = new ArrayList<>();
    afterSimple1.add("-2");
    afterSimple1.add("-");
    afterSimple1.add("3");
    assertEquals(afterSimple1, math.fixInfixArrayListMinuses(beforeSimple1));

    ArrayList<String> beforeSimple2 = new ArrayList<>();
    beforeSimple2.add("-");
    beforeSimple2.add("6");
    ArrayList<String> afterSimple2 = new ArrayList<>();
    afterSimple2.add("-6");
    assertEquals(afterSimple2, math.fixInfixArrayListMinuses(beforeSimple2));

    ArrayList<String> beforeSimple3 = new ArrayList<>();
    beforeSimple3.add("-");
    beforeSimple3.add("-6");
    ArrayList<String> afterSimple3 = new ArrayList<>();
    afterSimple3.add("6");
    assertEquals(afterSimple3, math.fixInfixArrayListMinuses(beforeSimple3));

    ArrayList<String> beforeSimple4 = new ArrayList<>();
    beforeSimple4.add("6");
    beforeSimple4.add("-");
    beforeSimple4.add("-");
    beforeSimple4.add("4");
    ArrayList<String> afterSimple4 = new ArrayList<>();
    afterSimple4.add("6");
    afterSimple4.add("+");
    afterSimple4.add("4");
    assertEquals(afterSimple4, math.fixInfixArrayListMinuses(beforeSimple4));

    ArrayList<String> beforeMedium1 = new ArrayList<>();
    beforeMedium1.add("2");
    beforeMedium1.add("+");
    beforeMedium1.add("-");
    beforeMedium1.add("2");
    ArrayList<String> afterMedium1 = new ArrayList<>();
    afterMedium1.add("2");
    afterMedium1.add("+");
    afterMedium1.add("-2");
    assertEquals(afterMedium1, math.fixInfixArrayListMinuses(beforeMedium1));

    ArrayList<String> beforeMedium2 = new ArrayList<>();
    beforeMedium2.add("3");
    beforeMedium2.add("-");
    beforeMedium2.add("-");
    beforeMedium2.add("-");
    beforeMedium2.add("3");
    ArrayList<String> afterMedium2 = new ArrayList<>();
    afterMedium2.add("3");
    afterMedium2.add("+");
    afterMedium2.add("-3");
    assertEquals(afterMedium2, math.fixInfixArrayListMinuses(beforeMedium2));

    ArrayList<String> beforeMedium3 = new ArrayList<>();
    beforeMedium3.add("3");
    beforeMedium3.add("+");
    beforeMedium3.add("4");
    beforeMedium3.add("-");
    beforeMedium3.add("-5");
    ArrayList<String> afterMedium3 = new ArrayList<>();
    afterMedium3.add("3");
    afterMedium3.add("+");
    afterMedium3.add("4");
    afterMedium3.add("-");
    afterMedium3.add("-5");
    assertEquals(afterMedium3, math.fixInfixArrayListMinuses(beforeMedium3));

    ArrayList<String> beforeMedium4 = new ArrayList<>();
    beforeMedium4.add("9");
    beforeMedium4.add("-");
    beforeMedium4.add("-");
    beforeMedium4.add("8");
    beforeMedium4.add("/");
    beforeMedium4.add("-");
    beforeMedium4.add("4");
    beforeMedium4.add("*");
    beforeMedium4.add("-");
    beforeMedium4.add("3");
    ArrayList<String> afterMedium4 = new ArrayList<>();
    afterMedium4.add("9");
    afterMedium4.add("+");
    afterMedium4.add("8");
    afterMedium4.add("/");
    afterMedium4.add("-4");
    afterMedium4.add("*");
    afterMedium4.add("-3");
    assertEquals(afterMedium4, math.fixInfixArrayListMinuses(beforeMedium4));

    ArrayList<String> beforeParentheses1 = new ArrayList<>();
    beforeParentheses1.add("-");
    beforeParentheses1.add("(");
    beforeParentheses1.add("2");
    beforeParentheses1.add(")");
    ArrayList<String> afterParentheses1 = new ArrayList<>();
    afterParentheses1.add("(");
    afterParentheses1.add("-2");
    afterParentheses1.add(")");
    assertEquals(afterParentheses1, math.fixInfixArrayListMinuses(beforeParentheses1));

    ArrayList<String> beforeParentheses2 = new ArrayList<>();
    beforeParentheses2.add("-");
    beforeParentheses2.add("(");
    beforeParentheses2.add("3");
    beforeParentheses2.add("-");
    beforeParentheses2.add("1");
    beforeParentheses2.add(")");
    ArrayList<String> afterParentheses2 = new ArrayList<>();
    afterParentheses2.add("(");
    afterParentheses2.add("-3");
    afterParentheses2.add("-");
    afterParentheses2.add("-1");
    afterParentheses2.add(")");
    assertEquals(afterParentheses2, math.fixInfixArrayListMinuses(beforeParentheses2));

    ArrayList<String> beforeParentheses3 = new ArrayList<>();
    beforeParentheses3.add("-");
    beforeParentheses3.add("(");
    beforeParentheses3.add("4");
    beforeParentheses3.add("-");
    beforeParentheses3.add("(");
    beforeParentheses3.add("1");
    beforeParentheses3.add("+");
    beforeParentheses3.add("2");
    beforeParentheses3.add(")");
    beforeParentheses3.add(")");
    ArrayList<String> afterParentheses3 = new ArrayList<>();
    afterParentheses3.add("(");
    afterParentheses3.add("-4");
    afterParentheses3.add("-");
    afterParentheses3.add("(");
    afterParentheses3.add("-1");
    afterParentheses3.add("+");
    afterParentheses3.add("-2");
    afterParentheses3.add(")");
    afterParentheses3.add(")");
    assertEquals(afterParentheses3, math.fixInfixArrayListMinuses(beforeParentheses3));
  }

  @Test
  public void infixToPostfixArrayList() {
    ArrayList<String> simpleInfix1 = new ArrayList<>();
    simpleInfix1.add("3");
    simpleInfix1.add("+");
    simpleInfix1.add("4");
    ArrayList<String> simplePostfix1 = new ArrayList<>();
    simplePostfix1.add("3");
    simplePostfix1.add("4");
    simplePostfix1.add("+");
    assertEquals(simplePostfix1, math.infixToPostfixArrayList(simpleInfix1));

    ArrayList<String> simpleInfix2 = new ArrayList<>();
    simpleInfix2.add("6");
    simpleInfix2.add("+");
    simpleInfix2.add("4");
    simpleInfix2.add("-");
    simpleInfix2.add("5");
    ArrayList<String> simplePostfix2 = new ArrayList<>();
    simplePostfix2.add("6");
    simplePostfix2.add("4");
    simplePostfix2.add("+");
    simplePostfix2.add("5");
    simplePostfix2.add("-");
    assertEquals(simplePostfix2, math.infixToPostfixArrayList(simpleInfix2));

    ArrayList<String> simpleInfix3 = new ArrayList<>();
    simpleInfix3.add("2");
    simpleInfix3.add("-");
    simpleInfix3.add("1");
    simpleInfix3.add("+");
    simpleInfix3.add("4");
    simpleInfix3.add("-");
    simpleInfix3.add("5");
    simpleInfix3.add("+");
    simpleInfix3.add("6");
    ArrayList<String> simplePostfix3 = new ArrayList<>();
    simplePostfix3.add("2");
    simplePostfix3.add("1");
    simplePostfix3.add("-");
    simplePostfix3.add("4");
    simplePostfix3.add("+");
    simplePostfix3.add("5");
    simplePostfix3.add("-");
    simplePostfix3.add("6");
    simplePostfix3.add("+");
    assertEquals(simplePostfix3, math.infixToPostfixArrayList(simpleInfix3));

    ArrayList<String> mdasInfix1 = new ArrayList<>();
    mdasInfix1.add("9");
    mdasInfix1.add("-");
    mdasInfix1.add("8");
    mdasInfix1.add("/");
    mdasInfix1.add("4");
    ArrayList<String> mdasPostfix1 = new ArrayList<>();
    mdasPostfix1.add("9");
    mdasPostfix1.add("8");
    mdasPostfix1.add("4");
    mdasPostfix1.add("/");
    mdasPostfix1.add("-");
    assertEquals(mdasPostfix1, math.infixToPostfixArrayList(mdasInfix1));

    ArrayList<String> mdasInfix2 = new ArrayList<>();
    mdasInfix2.add("5");
    mdasInfix2.add("*");
    mdasInfix2.add("2");
    mdasInfix2.add("-");
    mdasInfix2.add("8");
    mdasInfix2.add("/");
    mdasInfix2.add("4");
    mdasInfix2.add("+");
    mdasInfix2.add("0");
    mdasInfix2.add("*");
    mdasInfix2.add("6");
    ArrayList<String> mdasPostfix2 = new ArrayList<>();
    mdasPostfix2.add("5");
    mdasPostfix2.add("2");
    mdasPostfix2.add("*");
    mdasPostfix2.add("8");
    mdasPostfix2.add("4");
    mdasPostfix2.add("/");
    mdasPostfix2.add("-");
    mdasPostfix2.add("0");
    mdasPostfix2.add("6");
    mdasPostfix2.add("*");
    mdasPostfix2.add("+");
    assertEquals(mdasPostfix2, math.infixToPostfixArrayList(mdasInfix2));

    ArrayList<String> mdasInfix3 = new ArrayList<>();
    mdasInfix3.add("1");
    mdasInfix3.add("+");
    mdasInfix3.add("2");
    mdasInfix3.add("*");
    mdasInfix3.add("8");
    mdasInfix3.add("-");
    mdasInfix3.add("4");
    mdasInfix3.add("/");
    mdasInfix3.add("2");
    mdasInfix3.add("*");
    mdasInfix3.add("6");
    ArrayList<String> mdasPostfix3 = new ArrayList<>();
    mdasPostfix3.add("1");
    mdasPostfix3.add("2");
    mdasPostfix3.add("8");
    mdasPostfix3.add("*");
    mdasPostfix3.add("+");
    mdasPostfix3.add("4");
    mdasPostfix3.add("2");
    mdasPostfix3.add("/");
    mdasPostfix3.add("6");
    mdasPostfix3.add("*");
    mdasPostfix3.add("-");
    assertEquals(mdasPostfix3, math.infixToPostfixArrayList(mdasInfix3));

    ArrayList<String> mdasInfix4 = new ArrayList<>();
    mdasInfix4.add("9");
    mdasInfix4.add("-");
    mdasInfix4.add("8");
    mdasInfix4.add("*");
    mdasInfix4.add("7");
    mdasInfix4.add("+");
    mdasInfix4.add("6");
    mdasInfix4.add("/");
    mdasInfix4.add("3");
    mdasInfix4.add("*");
    mdasInfix4.add("2");
    ArrayList<String> mdasPostfix4 = new ArrayList<>();
    mdasPostfix4.add("9");
    mdasPostfix4.add("8");
    mdasPostfix4.add("7");
    mdasPostfix4.add("*");
    mdasPostfix4.add("-");
    mdasPostfix4.add("6");
    mdasPostfix4.add("3");
    mdasPostfix4.add("/");
    mdasPostfix4.add("2");
    mdasPostfix4.add("*");
    mdasPostfix4.add("+");
    assertEquals(mdasPostfix4, math.infixToPostfixArrayList(mdasInfix4));

    ArrayList<String> mdasInfix5 = new ArrayList<>();
    mdasInfix5.add("1");
    mdasInfix5.add("+");
    mdasInfix5.add("3");
    mdasInfix5.add("-");
    mdasInfix5.add("9");
    mdasInfix5.add("*");
    mdasInfix5.add("3");
    mdasInfix5.add("/");
    mdasInfix5.add("6");
    mdasInfix5.add("*");
    mdasInfix5.add("14");
    mdasInfix5.add("+");
    mdasInfix5.add("100");
    ArrayList<String> mdasPostfix5 = new ArrayList<>();
    mdasPostfix5.add("1");
    mdasPostfix5.add("3");
    mdasPostfix5.add("+");
    mdasPostfix5.add("9");
    mdasPostfix5.add("3");
    mdasPostfix5.add("*");
    mdasPostfix5.add("6");
    mdasPostfix5.add("/");
    mdasPostfix5.add("14");
    mdasPostfix5.add("*");
    mdasPostfix5.add("-");
    mdasPostfix5.add("100");
    mdasPostfix5.add("+");
    assertEquals(mdasPostfix5, math.infixToPostfixArrayList(mdasInfix5));

    ArrayList<String> parenInfix1 = new ArrayList<>();
    parenInfix1.add("2");
    parenInfix1.add("*");
    parenInfix1.add("(");
    parenInfix1.add("6");
    parenInfix1.add("+");
    parenInfix1.add("4");
    parenInfix1.add(")");
    parenInfix1.add("-");
    parenInfix1.add("3");
    ArrayList<String> parenPostfix1 = new ArrayList<>();
    parenPostfix1.add("2");
    parenPostfix1.add("6");
    parenPostfix1.add("4");
    parenPostfix1.add("+");
    parenPostfix1.add("*");
    parenPostfix1.add("3");
    parenPostfix1.add("-");
    assertEquals(parenPostfix1, math.infixToPostfixArrayList(parenInfix1));

    ArrayList<String> parenInfix2 = new ArrayList<>();
    parenInfix2.add("1");
    parenInfix2.add("+");
    parenInfix2.add("(");
    parenInfix2.add("9");
    parenInfix2.add("*");
    parenInfix2.add("4");
    parenInfix2.add("+");
    parenInfix2.add("4");
    parenInfix2.add(")");
    parenInfix2.add("*");
    parenInfix2.add("9");
    ArrayList<String> parenPostfix2 = new ArrayList<>();
    parenPostfix2.add("1");
    parenPostfix2.add("9");
    parenPostfix2.add("4");
    parenPostfix2.add("*");
    parenPostfix2.add("4");
    parenPostfix2.add("+");
    parenPostfix2.add("9");
    parenPostfix2.add("*");
    parenPostfix2.add("+");
    assertEquals(parenPostfix2, math.infixToPostfixArrayList(parenInfix2));

    ArrayList<String> parenInfix3 = new ArrayList<>();
    parenInfix3.add("1");
    parenInfix3.add("-");
    parenInfix3.add("(");
    parenInfix3.add("2");
    parenInfix3.add("+");
    parenInfix3.add("(");
    parenInfix3.add("3");
    parenInfix3.add("-");
    parenInfix3.add("2");
    parenInfix3.add(")");
    parenInfix3.add(")");
    parenInfix3.add("*");
    parenInfix3.add("4");
    ArrayList<String> parenPostfix3 = new ArrayList<>();
    parenPostfix3.add("1");
    parenPostfix3.add("2");
    parenPostfix3.add("3");
    parenPostfix3.add("2");
    parenPostfix3.add("-");
    parenPostfix3.add("+");
    parenPostfix3.add("4");
    parenPostfix3.add("*");
    parenPostfix3.add("-");
    assertEquals(parenPostfix3, math.infixToPostfixArrayList(parenInfix3));

    ArrayList<String> parenInfix4 = new ArrayList<>();
    parenInfix4.add("10");
    parenInfix4.add("*");
    parenInfix4.add("(");
    parenInfix4.add("20");
    parenInfix4.add("/");
    parenInfix4.add("(");
    parenInfix4.add("30");
    parenInfix4.add("-");
    parenInfix4.add("20");
    parenInfix4.add(")");
    parenInfix4.add(")");
    parenInfix4.add("-");
    parenInfix4.add("(");
    parenInfix4.add("1");
    parenInfix4.add("+");
    parenInfix4.add("6");
    parenInfix4.add(")");
    ArrayList<String> parenPostfix4 = new ArrayList<>();
    parenPostfix4.add("10");
    parenPostfix4.add("20");
    parenPostfix4.add("30");
    parenPostfix4.add("20");
    parenPostfix4.add("-");
    parenPostfix4.add("/");
    parenPostfix4.add("*");
    parenPostfix4.add("1");
    parenPostfix4.add("6");
    parenPostfix4.add("+");
    parenPostfix4.add("-");
    assertEquals(parenPostfix4, math.infixToPostfixArrayList(parenInfix4));

    ArrayList<String> parenInfix5 = new ArrayList<>();
    parenInfix5.add("36");
    parenInfix5.add("/");
    parenInfix5.add("(");
    parenInfix5.add("-");
    parenInfix5.add("3");
    parenInfix5.add("+");
    parenInfix5.add("15");
    parenInfix5.add(")");
    ArrayList<String> parenPostfix5 = new ArrayList<>();
    parenPostfix5.add("36");
    parenPostfix5.add("-3");
    parenPostfix5.add("15");
    parenPostfix5.add("+");
    parenPostfix5.add("/");
    assertEquals(parenPostfix5, math.infixToPostfixArrayList(parenInfix5));
  }

  @Test
  public void postfixOpsAreValid() {
    ArrayList<String> postfixOps1 = new ArrayList<>();
    postfixOps1.add("9");
    postfixOps1.add("-");
    assertFalse(math.postfixOpsAreValid(postfixOps1));

    ArrayList<String> postfixOps2 = new ArrayList<>();
    postfixOps2.add("9");
    postfixOps2.add("3");
    postfixOps2.add("-");
    assertTrue(math.postfixOpsAreValid(postfixOps2));

    ArrayList<String> postfixOps3 = new ArrayList<>();
    postfixOps3.add("-4");
    assertTrue(math.postfixOpsAreValid(postfixOps3));

    ArrayList<String> postfixOps4 = new ArrayList<>();
    postfixOps4.add("9");
    postfixOps4.add("10");
    postfixOps4.add("+");
    postfixOps4.add("14");
    postfixOps4.add("-");
    postfixOps4.add("6");
    postfixOps4.add("/");
    assertTrue(math.postfixOpsAreValid(postfixOps4));

    ArrayList<String> postfixOps5 = new ArrayList<>();
    postfixOps5.add("90");
    postfixOps5.add("10");
    postfixOps5.add("+");
    postfixOps5.add("15");
    postfixOps5.add("-");
    postfixOps5.add("+");
    postfixOps5.add("6");
    postfixOps5.add("-");
    assertFalse(math.postfixOpsAreValid(postfixOps5));

    ArrayList<String> postfixOps6 = new ArrayList<>();
    postfixOps6.add("1000");
    postfixOps6.add("/");
    postfixOps6.add("4");
    postfixOps6.add("-");
    postfixOps6.add("62");
    postfixOps6.add("+");
    postfixOps6.add("1");
    postfixOps6.add("-");
    assertFalse(math.postfixOpsAreValid(postfixOps6));

    ArrayList<String> postfixOps7 = new ArrayList<>();
    postfixOps7.add("1000");
    postfixOps7.add("4");
    postfixOps7.add("/");
    postfixOps7.add("72");
    postfixOps7.add("+");
    postfixOps7.add("1");
    postfixOps7.add("-");
    assertTrue(math.postfixOpsAreValid(postfixOps7));
  }

  @Test
  public void negateNumberAtIndex() {
    ArrayList<String> before1 = new ArrayList<>();
    before1.add("2");
    before1.add("-");
    before1.add("8");
    before1.add("+");
    ArrayList<String> after1 = new ArrayList<>();
    after1.add("-2");
    after1.add("8");
    after1.add("+");
    assertEquals(after1, math.negateNumberAtIndex(0, before1));

    ArrayList<String> before2 = new ArrayList<>();
    before2.add("9");
    before2.add("-");
    before2.add("8");
    before2.add("-");
    ArrayList<String> after2 = new ArrayList<>();
    after2.add("-9");
    after2.add("8");
    after2.add("-");
    assertEquals(after2, math.negateNumberAtIndex(0, before2));

    ArrayList<String> before3 = new ArrayList<>();
    before3.add("10");
    before3.add("5");
    before3.add("-");
    before3.add("3");
    before3.add("-");
    ArrayList<String> after3 = new ArrayList<>();
    after3.add("10");
    after3.add("5");
    after3.add("-");
    after3.add("-3");
    assertEquals(after3, math.negateNumberAtIndex(3, before3));

    ArrayList<String> before4 = new ArrayList<>();
    before4.add("10");
    before4.add("5");
    before4.add("-");
    before4.add("4");
    before4.add("-");
    before4.add("7");
    before4.add("2");
    before4.add("-");
    before4.add("-");
    before4.add("-");
    ArrayList<String> after4 = new ArrayList<>();
    after4.add("10");
    after4.add("5");
    after4.add("-");
    after4.add("-4");
    after4.add("7");
    after4.add("2");
    after4.add("-");
    after4.add("-");
    after4.add("-");
    assertEquals(after4, math.negateNumberAtIndex(3, before4));
  }

  @Test
  public void realignPostfixOps() {
    ArrayList<String> beforeCleanBasic1 = new ArrayList<>();
    beforeCleanBasic1.add("8");
    beforeCleanBasic1.add("-");
    beforeCleanBasic1.add("4");
    beforeCleanBasic1.add("/");
    ArrayList<String> afterCleanBasic1 = new ArrayList<>();
    afterCleanBasic1.add("-8");
    afterCleanBasic1.add("4");
    afterCleanBasic1.add("/");
    assertEquals(afterCleanBasic1, math.realignPostfixOps(beforeCleanBasic1));

    ArrayList<String> beforeCleanBasic2 = new ArrayList<>();
    beforeCleanBasic2.add("8");
    beforeCleanBasic2.add("*");
    beforeCleanBasic2.add("4");
    beforeCleanBasic2.add("-");
    ArrayList<String> afterCleanBasic2 = new ArrayList<>();
    afterCleanBasic2.add("8");
    afterCleanBasic2.add("-4");
    afterCleanBasic2.add("*");
    assertEquals(afterCleanBasic2, math.realignPostfixOps(beforeCleanBasic2));

    ArrayList<String> beforeCleanBasic3 = new ArrayList<>();
    beforeCleanBasic3.add("8");
    beforeCleanBasic3.add("*");
    beforeCleanBasic3.add("12");
    beforeCleanBasic3.add("/");
    beforeCleanBasic3.add("4");
    beforeCleanBasic3.add("-");
    ArrayList<String> afterCleanBasic3 = new ArrayList<>();
    afterCleanBasic3.add("8");
    afterCleanBasic3.add("12");
    afterCleanBasic3.add("*");
    afterCleanBasic3.add("-4");
    afterCleanBasic3.add("/");
    assertEquals(afterCleanBasic3, math.realignPostfixOps(beforeCleanBasic3));
  }

  @Test
  public void rpnCalculator() {
    ArrayList<String> simple1 = new ArrayList<>();
    simple1.add("2");
    simple1.add("3");
    simple1.add("+");
    assertEquals(5, math.rpnCalculator(simple1));

    ArrayList<String> simple2 = new ArrayList<>();
    simple2.add("1");
    simple2.add("3");
    simple2.add("-");
    assertEquals(-2, math.rpnCalculator(simple2));

    ArrayList<String> simple3 = new ArrayList<>();
    simple3.add("9");
    simple3.add("3");
    simple3.add("*");
    assertEquals(27, math.rpnCalculator(simple3));

    ArrayList<String> simple4 = new ArrayList<>();
    simple4.add("12");
    simple4.add("3");
    simple4.add("/");
    assertEquals(4, math.rpnCalculator(simple4));

    ArrayList<String> simple5 = new ArrayList<>();
    simple5.add("5");
    assertEquals(5, math.rpnCalculator(simple5));

    ArrayList<String> simple6 = new ArrayList<>();
    simple6.add("-6");
    assertEquals(-6, math.rpnCalculator(simple6));

    ArrayList<String> compound1 = new ArrayList<>();
    compound1.add("6");
    compound1.add("3");
    compound1.add("-");
    compound1.add("8");
    compound1.add("+");
    assertEquals(11, math.rpnCalculator(compound1));

    ArrayList<String> compound2 = new ArrayList<>();
    compound2.add("5");
    compound2.add("3");
    compound2.add("6");
    compound2.add("*");
    compound2.add("+");
    assertEquals(23, math.rpnCalculator(compound2));

    ArrayList<String> compound3 = new ArrayList<>();
    compound3.add("1");
    compound3.add("2");
    compound3.add("*");
    compound3.add("4");
    compound3.add("+");
    assertEquals(6, math.rpnCalculator(compound3));

    ArrayList<String> compound4 = new ArrayList<>();
    compound4.add("1");
    compound4.add("2");
    compound4.add("+");
    compound4.add("9");
    compound4.add("3");
    compound4.add("/");
    compound4.add("-");
    assertEquals(0, math.rpnCalculator(compound4));

    ArrayList<String> compound5 = new ArrayList<>();
    compound5.add("1");
    compound5.add("2");
    compound5.add("8");
    compound5.add("*");
    compound5.add("4");
    compound5.add("/");
    compound5.add("+");
    assertEquals(5, math.rpnCalculator(compound5));

    ArrayList<String> compound6 = new ArrayList<>();
    compound6.add("6");
    compound6.add("7");
    compound6.add("+");
    compound6.add("8");
    compound6.add("9");
    compound6.add("*");
    compound6.add("-");
    compound6.add("10");
    compound6.add("+");
    assertEquals(-49, math.rpnCalculator(compound6));

    ArrayList<String> compound7 = new ArrayList<>();
    compound7.add("1.2");
    compound7.add("3.4");
    compound7.add("+");
    compound7.add("9.9");
    compound7.add("*");
    assertEquals(45.54, math.rpnCalculator(compound7));

    ArrayList<String> compound8 = new ArrayList<>();
    compound8.add("8");
    compound8.add("3");
    compound8.add("*");
    compound8.add("8");
    compound8.add("4");
    compound8.add("/");
    compound8.add("-");
    compound8.add("-6");
    compound8.add("+");
    assertEquals(16, math.rpnCalculator(compound8));

  }

  @Test //final test
  public void calculate() {
    String simple1 = "1 + 2";
    assertEquals(3, math.calculate(simple1));

    String simple2 = "9 * 3";
    assertEquals(27, math.calculate(simple2));

    String simple3 = "12 / 6";
    assertEquals(2, math.calculate(simple3));

    String simple4 = "4 - 2";
    assertEquals(2, math.calculate(simple4));

    String simple5 = "-38 + 2";
    assertEquals(-36, math.calculate(simple5));

    String simple6 = "3 * -2";
    assertEquals(-6, math.calculate(simple6));

    String codewars1 = "3 - -6";
    assertEquals(9, math.calculate(codewars1));

    String codewars2 = "36 /(-3 + 15)";
    assertEquals(3, math.calculate(codewars2));

    String codewars3 = "123/-(-5 + 2)";
    assertEquals(41, math.calculate(codewars3));
  }

}