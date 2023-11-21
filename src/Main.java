public class Main {
    public static void main(String[] args) {
//        int[][] i0 = new int[0][0];
        int[][] i1 = new int[3][2];
        i1[0] = new int[]{1, 4};
        i1[1] = new int[]{0, 5};
//        i1[3] = new int[]{8, 11};
//        i1[4] = new int[]{-241, -238};
//        i1[5] = new int[]{-318, -313};
//        i1[6] = new int[]{-35, -23};
        System.out.println(Interval.sumIntervals(i1));

    }
}