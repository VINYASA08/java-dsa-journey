
package Arrays;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25, 30};

        reverse(arr);
        System.out.println("Reverse: " + Arrays.toString(arr));

        leftRotate(arr, 2);
        System.out.println("Left Rotation: " + Arrays.toString(arr));

        rightRotate(arr, 2);
        System.out.println("Right Rotation: " + Arrays.toString(arr));

        int[] copy = copyOld(arr);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Move Zeroes: " + Arrays.toString(nums));

        int[] arr1 = {9,10,110,-2};
        System.out.println(removeNegativeNumbers(arr1));

        int[] arr2 = {10,10,10,10,10,10,10,10,10,20,20,20,20};
        System.out.println(removeDuplicateNumbers(arr2));

    }

    static void reverse(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        reverse(arr, 0, arr.length - 1);
    }

    static void reverse(int[] arr, int left, int right) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        if (left < 0 || right >= arr.length || left > right) {
            throw new IllegalArgumentException("Invalid range");
        }

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static void leftRotate(int[] arr, int k) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int n = arr.length;

        if (n == 0) {
            return;
        }

        k = Math.floorMod(k, n);

        if (k == 0) {
            return;
        }

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void rightRotate(int[] arr, int k) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int n = arr.length;

        if (n == 0) {
            return;
        }

        k = Math.floorMod(k, n);

        if (k == 0) {
            return;
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static int[] copyOld(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        return newArray;
    }

    static void moveZeroes(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        while (position < arr.length) {
            arr[position] = 0;
            position++;
        }
    }

    static int removeNegativeNumbers(int[] arr){
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int slow = 0;

        for(int fast = 0 ; fast < arr.length ;fast++){

            if(arr[fast] >= 0){
                arr[slow] = arr[fast];
                slow++;
            }
        }

        return slow;
    }

    static int removeDuplicateNumbers(int[] arr){
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int slow = 0;

        for(int fast = 0 ; fast < arr.length ;fast++){
            if(!isDuplicate(arr ,arr[fast] ,slow)){
                arr[slow] = arr[fast];
                slow++;
            }
        }

        return slow;
    }

    static boolean isDuplicate(int[] arr , int value , int end){

        for(int j = 0 ; j < end ; j++){
            if(arr[j] == value){
                return true;
            }
        }
        return false;
    }
}
