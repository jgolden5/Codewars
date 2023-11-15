public class Interval {
    static int[][] referenceIntervals = new int[0][];
    public static int sumIntervals(int[][] intervals) {
        int sumOfDifferences = 0;
        int spaceBetweenRepeatedIntervals = 0;
        for(int i = 0; i < intervals.length; i++) {
            int low = intervals[i][0];
            int high = intervals[i][1];
            sumOfDifferences += high - low;
        }
        int currentIntervalStartingIndex = 0;
        if(currentIntervalStartingIndex < intervals.length) {
            referenceIntervals[0] = intervals[0];
            for(int i = 0; i < referenceIntervals.length; i++) {
                spaceBetweenRepeatedIntervals += subtractRedundantIntervalsFromSum(intervals[0], intervals);
            }
        }
        return sumOfDifferences - spaceBetweenRepeatedIntervals;
    }

    public static int subtractRedundantIntervalsFromSum(int[] originalInterval, int[][] intervals) {
        int spaceBetweenRepeatedIntervals = 0;
        int originalLow = originalInterval[0];
        int originalHigh = originalInterval[1];
        for(int j = 1; j < intervals.length; j++) {
            int newLow = intervals[j][0];
            int newHigh = intervals[j][1];
            String repetitionLocation;
            if(newLow > originalHigh || newHigh < originalLow) {
                repetitionLocation = "outside";
                System.out.println("repetition location = outside");
//                intervals
            } else if(newLow < originalLow) {
                if(newHigh <= originalHigh) {
                    repetitionLocation = "start";
                } else {
                    repetitionLocation = "around";
                }
            } else if(newLow >= originalLow) {
                if(newHigh > originalHigh) {
                    repetitionLocation = "end";
                } else {
                    repetitionLocation = "middle";
                }
            } else {
                repetitionLocation = "unknown";
            }

            switch(repetitionLocation) {
                case "outside":
                    continue;
                case "start":
                    spaceBetweenRepeatedIntervals += newHigh - originalLow;
                    break;
                case "end":
                    spaceBetweenRepeatedIntervals += originalHigh - newLow;
                    break;
                case "middle":
                    spaceBetweenRepeatedIntervals += newHigh - newLow;
                    break;
                case "around":
                    spaceBetweenRepeatedIntervals += originalHigh - originalLow;
                    break;
                default:
                    System.out.println("Error: repetition location not recognized...");
            }

        }
        return spaceBetweenRepeatedIntervals;
    }
}

