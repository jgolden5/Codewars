import java.util.ArrayList;
import java.util.Collections;

public class SuperMarketQueue {
  public static int solveSuperMarketQueue(int[] customers, int n) {
    int t = 0;
    int[] customersAtTills = getCustomersAtTills(customers, n);
    int[] customersWaiting = getCustomersWaiting(customers, n);

    return t;
  }

  private static int[] getCustomersAtTills(int[] customers, int n) {
    int[] customersAtTills = new int[n];
    for(int i = 0; i < n; i++) {
      customersAtTills[i] = customers[i];
    }
    return customersAtTills;
  }

  private static int[] getCustomersWaiting(int[] customers, int n) {
    int[] customersWaiting = new int[customers.length - n];
    int indexOfCustomersWaiting = 0;
    for(int i = n; i < customers.length; i++) {
      customersWaiting[indexOfCustomersWaiting] = customers[i];
      indexOfCustomersWaiting++;
    }
    return customersWaiting;
  }

}
