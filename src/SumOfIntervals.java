import java.util.ArrayList;

public class SumOfIntervals {
    public static int sumIntervals(int[][] intervals) {
        ArrayList<ArrayList<Integer>> ignoredIntervals = new ArrayList<>();
        int low = 0;
        int high = 0;
        if(intervals.length > 0) {
            if (intervals[0][0] != intervals[0][1]) {
                low = intervals[0][0];
                high = intervals[0][1];
            }
            if (intervals.length > 1) {
                for (int i = 1; i < intervals.length; i++) {
                    int[] currentInterval = intervals[i];
                    int first = currentInterval[0];
                    int second = currentInterval[1];
                    if (first != second) {
                        if (second < low) {
                            ArrayList<Integer> newArrList = new ArrayList<>();
                            newArrList.add(second);
                            newArrList.add(low);
                            ignoredIntervals.add(newArrList);
                            low = first;
                        } else if (first > high) {
                            ArrayList<Integer> newArrList = new ArrayList<>();
                            newArrList.add(high);
                            newArrList.add(first);
                            ignoredIntervals.add(newArrList);
                            high = second;
                        } else if (first < low || second > high) {
                            if (first < low) {
                                ignoredIntervals = unignore(currentInterval, ignoredIntervals);
                                low = first;
                            }
                            if (second > high) {
                                ignoredIntervals = unignore(currentInterval, ignoredIntervals);
                                high = second;
                            }
                        } else {
                            ignoredIntervals = unignore(currentInterval, ignoredIntervals);
                        }
                    }
                }
            }
        }
        int numberToSubtractFromRange = calculateIgnoredIntervalTotal(ignoredIntervals);
        int grandTotal = high - low - numberToSubtractFromRange;
        return grandTotal;
    }
    public static ArrayList<ArrayList<Integer>> unignore(int[] intervalToUnignore, ArrayList<ArrayList<Integer>> ignoredIntervals) {
        int lUnignore = intervalToUnignore[0];
        int hUnignore = intervalToUnignore[1];
        ArrayList<ArrayList<Integer>> newIgnoredIntervals = new ArrayList<>();
        for(int i = 0; i < ignoredIntervals.size(); i++) {
            int lIgnore = ignoredIntervals.get(i).get(0);
            int hIgnore = ignoredIntervals.get(i).get(1);
            if(lUnignore <= hIgnore && hUnignore >= lIgnore) {
                //refactor everything inside this if block to fix the conditionals
                if(lUnignore > lIgnore && hUnignore > hIgnore) {
                    ArrayList<Integer> nextIgnoredInterval = new ArrayList<>();
                    nextIgnoredInterval.add(lIgnore);
                    nextIgnoredInterval.add(lUnignore);
                    newIgnoredIntervals.add(nextIgnoredInterval);
                } else if(lUnignore <= lIgnore && hUnignore < hIgnore) {
                    ArrayList<Integer> nextIgnoredInterval = new ArrayList<>();
                    nextIgnoredInterval.add(hUnignore);
                    nextIgnoredInterval.add(hIgnore);
                    newIgnoredIntervals.add(nextIgnoredInterval);
                } else if(lUnignore > lIgnore && hUnignore < hIgnore) {
                    ArrayList<Integer> nextIgnoredInterval = new ArrayList<>();
                    nextIgnoredInterval.add(lIgnore);
                    nextIgnoredInterval.add(lUnignore);
                    newIgnoredIntervals.add(nextIgnoredInterval);
                    nextIgnoredInterval = new ArrayList<>();
                    nextIgnoredInterval.add(hUnignore);
                    nextIgnoredInterval.add(hIgnore);
                    newIgnoredIntervals.add(nextIgnoredInterval);
                }
            } else {
                newIgnoredIntervals.add(ignoredIntervals.get(i));
            }
        }
        return newIgnoredIntervals;
    }

    public static int calculateIgnoredIntervalTotal(ArrayList<ArrayList<Integer>> ignoredIntervals) {
        int ignoredIntervalTotal = 0;
        for(int i = 0; i < ignoredIntervals.size(); i++) {
            ignoredIntervalTotal += ignoredIntervals.get(i).get(1) - ignoredIntervals.get(i).get(0);
        }
        return ignoredIntervalTotal;
    }

}