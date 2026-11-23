package Arrays;

/**
 * LeetCode 136: Single Number
 * (Previously filed under Searching/Array_2.java)
 *
 * Problem:
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 *
 * Approach:
 * Using XOR bitwise operator:
 * a ^ a = 0
 * a ^ 0 = a
 * XOR of all elements cancels out pairs, leaving only the unique number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Array: [4, 1, 2, 1, 2]");
        System.out.println("Single Number: " + singleNumber(nums)); // Output: 4
    }
}
