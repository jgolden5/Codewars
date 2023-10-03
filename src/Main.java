public class Main {
    public static void main(String[] args) {
        int[] arr0 = new int[]{-1, 2, -3, 4, -6, -16, -200, 15};
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{0, 1, 2, 3};
        int[] arr3 = new int[]{0};
        int[] arr4 = new int[]{-6, -3, 8, 7, -10};
        int[] arr5 = new int[]{-6, -2, -1, -9, -100};

        int[] arr6 = new int[]{4, -3, 9, 10};
        int[] arr7 = new int[]{1, -2, 2, 3};
        int[] arr8 = new int[]{4, -4, 6, 1};
        int[] arr9 = new int[]{5, -1, 6, 3};
        int[] arr10 = new int[]{5, -6, 4, 2};

//        System.out.println(MaxSubarraySum.sequence(arr1) == 10);
//        System.out.println(MaxSubarraySum.sequence(arr2) == 6);
//        System.out.println(MaxSubarraySum.sequence(arr3) == 0);
//        System.out.println(MaxSubarraySum.sequence(arr4) == 15);
//        System.out.println(MaxSubarraySum.sequence(arr5) == 0);
//
//        System.out.println(MaxSubarraySum.sequence(arr6) == 20);
//        System.out.println(MaxSubarraySum.sequence(arr7) == 5);
//        System.out.println(MaxSubarraySum.sequence(arr8) == 7);
//        System.out.println(MaxSubarraySum.sequence(arr9) == 13);
//        System.out.println(MaxSubarraySum.sequence(arr10) == 6);
        for(int element : MaxSubarraySum.excludeNegativeBookends(arr0)) {
            System.out.println(element);
        }
    }
}