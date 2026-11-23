package Searching;

/**
 * LeetCode 1672: Richest Customer Wealth
 * URL: https://leetcode.com/problems/richest-customer-wealth/description/
 *
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount
 * of money the i-th customer has in the j-th bank. Return the wealth that the richest
 * customer has.
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 */
public class LinearSearch_2 {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        System.out.println("Maximum Customer Wealth: " + maximumWealth(accounts)); // Output: 6
    }
}
