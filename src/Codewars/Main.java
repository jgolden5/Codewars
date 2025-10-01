package Codewars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> unorderedRandomInts = new ArrayList<>();
      unorderedRandomInts.add(3);
      unorderedRandomInts.add(4);
      unorderedRandomInts.add(2);
      unorderedRandomInts.add(9);
      unorderedRandomInts.add(10);
      unorderedRandomInts.add(1);
      unorderedRandomInts.add(0);
      System.out.println(EasyKata.getOrderedEvens(unorderedRandomInts));
    }
}