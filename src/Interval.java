import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        int[][] modifiedIntervals = intervals;
        for(int i = 0; i < modifiedIntervals.length; i++) {
            int[] intervalA = modifiedIntervals[i];
            int lowA = intervalA[0];
            int highA = intervalA[1];
            if(lowA != highA) {
                for(int j = i + 1; j < modifiedIntervals.length; j++) {
                    int[] intervalB = modifiedIntervals[j];
                    int lowB = intervalB[0];
                    int highB = intervalB[1];
                    if(lowB != highB) {
                        String intervalCondition;
                        if(lowB >= lowA && highB <= highA) {
                            intervalCondition = "inside";
                        } else if(lowB >= highA || lowA >= highB) {
                            intervalCondition = "separateFrom";
                        } else if(lowB < lowA && highB < highA) {
                            intervalCondition = "below";
                        } else if(lowA < lowB) {
                            intervalCondition = "above";
                        } else {
                            intervalCondition = "surrounding";
                        }
                        System.out.println("Interval A: " + Arrays.toString(intervalA));
                        System.out.println("Interval B: " + Arrays.toString(intervalB));
                        System.out.println(Arrays.toString(intervalB) + " is " + intervalCondition + " " + Arrays.toString(intervalA));
//                        switch (intervalCondition) {
//                            case "surrounding":
//
//                        }
                    }
                }
            }
        }
        return -1;
    }
}