public class searchInRange {
    static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        System.out.println(search(myArray,target,6,10));
    }

    static int  search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -2;
    }
}
