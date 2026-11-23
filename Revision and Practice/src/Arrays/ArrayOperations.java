package Arrays;

/**
 * Fundamental Array Operations:
 * 1. Traversal / Display
 * 2. Insertion (at specific index)
 * 3. Deletion (by value / index)
 * 4. Linear Search
 * 5. Reversal
 */
public class ArrayOperations {

    static void main(String[] args) {
        int[] arr = {1,5,2,3,6,4,9,7,9};
//        System.out.println(maxElements(arr));
//        System.out.println(firstOccurrenceIndex(arr,55));
        int[] arr2 = new int[10];
          System.out.println(insertAtIndex(arr2, 10 , 3));
    }

    static int maxElements(int arr[]){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = 0;

        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i] >=max){
               max=arr[i];
            }
        }
        return max;
    }

    static int firstOccurrenceIndex(int[] arr,int target){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int index = -1;

        for(int i = 0 ;i < arr.length;i++){
            if(arr[i] == target){
                index = i;
            }
        }
        return index;
    }

    static boolean insertAtIndex(int[] arr , int value, int index){

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null");
        }

        if(index > arr.length){
            System.out.println("Target is out of arrya size");
        }

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        return true;
    }

    static boolean deleteAtIndex(int[] arr, int index) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bound");
            return false;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        return true;
    }

}
