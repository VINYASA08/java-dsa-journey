//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/


public class leet_153 {


    static void main(String[] args) {

        int[] arr = {11, 13, 15, 17};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}
