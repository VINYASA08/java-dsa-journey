//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package Searching;

public class Linear_1 {
    static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int result=findNumbers(nums);
        System.out.println(result);
    }

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                digits++;
                num = num / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
