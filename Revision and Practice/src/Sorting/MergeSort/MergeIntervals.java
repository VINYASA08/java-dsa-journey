package Sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 56: Merge Intervals
 * URL: https://leetcode.com/problems/merge-intervals/
 * (Previously filed under Sorting/mergeSort/prob_1.java)
 *
 * Problem:
 * Given an array of intervals where intervals[i] = [start_i, end_i], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 *
 * Approach:
 * 1. Sort the intervals by their starting times.
 * 2. Traverse through each interval:
 *    - If the current interval overlaps with the previous one (current start <= previous end),
 *      merge them by updating the end time to max(previous end, current end).
 *    - Otherwise, add the current interval to the result list.
 *
 * Time Complexity: O(n log n) due to sorting
 * Space Complexity: O(n) for the output list
 */
public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            int lastEnd = currentInterval[1];

            if (currentStart <= lastEnd) {
                // Overlapping intervals: merge by taking the maximum end time
                currentInterval[1] = Math.max(lastEnd, currentEnd);
            } else {
                // Non-overlapping interval: start a new interval
                currentInterval = intervals[i];
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        System.out.println("Original intervals: " + Arrays.deepToString(intervals));
        int[][] result = merge(intervals);
        System.out.println("Merged intervals:   " + Arrays.deepToString(result));
        // Expected output: [[1, 6], [8, 10], [15, 18]]
    }
}
