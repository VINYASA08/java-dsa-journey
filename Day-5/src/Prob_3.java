import java.util.Arrays;
import java.util.Scanner;

//Problem Description
//Given a dynamic list of integers nums, perform the following modifications in-place:
//
//Remove all even numbers from the list.
//
//Reverse the remaining odd numbers in the list.
//
//You must not use built-in library functions like Collections.reverse(). Modify
// the original ArrayList directly.
public class Prob_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = n;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                i--;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print(Arrays.toString(arr)+" ");
        }
    }
}