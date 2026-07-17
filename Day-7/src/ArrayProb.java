//https://leetcode.com/problems/concatenation-of-array/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i
public class ArrayProb {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        System.out.println(java.util.Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
        }

        for(int i = 0; i < n; i++){
            ans[i + n] = nums[i];
        }

        return ans;
    }
}