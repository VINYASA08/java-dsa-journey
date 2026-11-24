//https://leetcode.com/problems/merge-intervals/description/?utm_source=chatgpt.com


import java.util.ArrayList;
import java.util.List;

public class leet_56 {

    static void main(String[] args) {

        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    }

    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            if (result.isEmpty()) {
                result.add(interval);
                continue;
            }

            int[] last = result.get(result.size() - 1);


        }

        return result;
    }


}
