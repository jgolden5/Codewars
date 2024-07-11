import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[]{5, 3, 4};
        int t1 = 1;
        int[] a2 = new int[]{10, 2, 3, 3};
        int t2 = 2;
        System.out.println(SuperMarketQueue.solveSuperMarketQueue(a1, t1));
        System.out.println(SuperMarketQueue.solveSuperMarketQueue(a2, t2));
    }
}