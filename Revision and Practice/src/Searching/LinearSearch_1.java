package Searching;

/**
 * LeetCode 1295: Find Numbers with Even Number of Digits
 * URL: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Time Complexity: O(n * log10(k)) where k is the max number
 * Space Complexity: O(1)
 */
public class LinearSearch_1 {

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

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int result = findNumbers(nums);
        System.out.println("Array: [555, 901, 482, 1771]");
        System.out.println("Numbers with even number of digits: " + result); // Output: 1 (1771)
    }
}
