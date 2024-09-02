import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(0);
      arrayList.add(1);
      arrayList.add(2);
      arrayList.add(3);
      arrayList.add(4);
      arrayList.add(5);
      String str = "I'm so cool";
      String[] strings = new String[]{"X", "Y", "Z"};
      System.out.println(5 == Last.last(arrayList) ? "✅" : "❌");
      System.out.println(Last.last(str) == 'l' ? "✅" : "❌");
      System.out.println(Last.last(strings).equals("Z") ? "✅" : "❌");
    }
}