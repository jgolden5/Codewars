//Next smaller number with the same digits
public class NextSmaller {
  public static long nextSmaller(long n) {
    String inputAsStr = n + "";
    String[] inputAsStrArray = inputAsStr.split("");
    int[] inputAsIntArray = stringArrayToIntArray(inputAsStrArray);
    int[] resIntArray = new int[inputAsIntArray.length];
    for(int i = inputAsIntArray.length - 2; i > 1; i -= 2) {
      if(inputAsIntArray[i] < inputAsIntArray[i - 1]) {
        resIntArray[i] = inputAsIntArray[i - 1];
        resIntArray[i - 1] = inputAsIntArray[i];
      }
    }

  }
  public static int[] stringArrayToIntArray(String[] sa) {
    int[] ia = new int[sa.length];
    for(int i = 0; i < sa.length; i++) {
      ia[i] = Integer.parseInt(sa[i]);
    }
    return ia;
  }
}
