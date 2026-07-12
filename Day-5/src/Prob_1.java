import java.util.Scanner;

//Problem Description
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
import java.util.Scanner;

public class Prob_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        int[] runningSum = new int[n];

        System.out.print("Enter the elements in the array: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
            runningSum[i] = sum;
        }

        System.out.print("Running sum: ");
        for (int i = 0; i < n; i++) {
            System.out.print(runningSum[i] + " ");
        }
    }
}
