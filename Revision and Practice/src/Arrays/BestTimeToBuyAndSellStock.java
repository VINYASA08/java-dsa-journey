package Arrays;

/**
 * LeetCode 121: Best Time to Buy and Sell Stock
 * (Previously filed under Searching/Array_1.java)
 *
 * Problem:
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Prices: [7, 1, 5, 3, 6, 4]");
        System.out.println("Maximum Profit: " + maxProfit(prices)); // Output: 5
    }
}
