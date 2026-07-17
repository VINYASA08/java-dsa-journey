import java.util.Arrays;

//https://leetcode.com/problems/find-peak-element/description/?envType=problem-list-v2&envId=binary-search
public class Prob_1 {
    static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
    }

    public int findPeakElement(int[] nums) {
                int left = 0;
                int right = nums.length - 1;

                while (left < right) {
                    int mid = left + (right - left) / 2;

                    if (nums[mid] < nums[mid + 1]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }

                return left;

    }
}
