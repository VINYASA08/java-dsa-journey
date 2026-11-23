package Searching;

/**
 * Binary Search Algorithm (Iterative & Recursive)
 * (Previously placeholder Binary_1.java)
 *
 * Precondition: The array must be sorted in ascending order.
 *
 * Time Complexity: O(log n)
 * Space Complexity:
 *   - Iterative: O(1)
 *   - Recursive: O(log n) call stack
 */
public class BinarySearch {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Not found
    }

    // Recursive Binary Search helper
    private static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target);
        } else {
            return binarySearchRecursive(arr, left, mid - 1, target);
        }
    }

    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursive(arr, 0, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        System.out.println("Array: [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]");
        System.out.println("Target: " + target);

        int iterativeResult = binarySearchIterative(sortedArr, target);
        System.out.println("Iterative search index: " + iterativeResult);

        int recursiveResult = binarySearchRecursive(sortedArr, target);
        System.out.println("Recursive search index: " + recursiveResult);
    }
}
