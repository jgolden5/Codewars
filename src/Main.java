import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[][] slug3 = new int[][] {
        { 1, 2, 3 },
        { 8, 9, 4 },
        { 7, 6, 5 }
      };
      int[] snailAnswer3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      System.out.println(Arrays.deepToString(slug3));
      System.out.println(Arrays.equals(Snail.snail(slug3), snailAnswer3) ? "✅" : "❌");
      int[][] slug5 = new int[][] {
        { 1, 2, 3, 4, 5 },
        { 16, 17, 18, 19, 6 },
        { 15, 24, 25, 20, 7 },
        { 14, 23, 22, 21, 8 },
        { 13, 12, 11, 10, 9 }
      };
      int[] snailAnswer5 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
      System.out.println(Arrays.deepToString(slug5));
      System.out.println(Arrays.equals(Snail.snail(slug5), snailAnswer5) ? "✅" : "❌");
      int[][] slug4 = new int[][] {
        { 1, 2, 3, 4 },
        { 12, 13, 14, 5 },
        { 11, 16, 15, 6 },
        { 10, 9, 8, 7 },
      };
      int[] snailAnswer4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
      System.out.println(Arrays.deepToString(slug4));
      System.out.println(Arrays.equals(Snail.snail(slug4), snailAnswer4) ? "✅" : "❌");
    }
}