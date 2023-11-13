public class Main {
    public static void main(String[] args) {
//        int[][] i0 = new int[0][0];
        int[][] i1 = new int[7][2];
//        i1[0] = new int[]{185, 201};
//        i1[1] = new int[]{-495, -489};
//        i1[2] = new int[]{444, 456};
//        i1[3] = new int[]{-488, -469};
//        i1[4] = new int[]{-241, -238};
//        i1[5] = new int[]{-318, -313};
//        i1[6] = new int[]{-35, -23};
        i1[0] = new int[]{31, 51};
        i1[1] = new int[]{93, 100};
        i1[2] = new int[]{-162, -156};
        i1[3] = new int[]{3, 17};
        i1[4] = new int[]{-89, -78};
        i1[5] = new int[]{319, 337};
        i1[6] = new int[]{-319, -315};
        System.out.println(SumOfIntervals.sumIntervals(i1));

    }
}