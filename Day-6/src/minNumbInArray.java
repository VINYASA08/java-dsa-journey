public class minNumbInArray {
    static void main(String[] args) {
        int[] arr = {10, 2, 3, 1,4, 5};
        System.out.println(findMin(arr));
        System.out.println(findMinInRange(arr,0,4));
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMinInRange(int[] arr,int start,int end) {
        int min = arr[start];
        for (int i = start + 1; i < end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
