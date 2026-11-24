//https://leetcode.com/problems/sort-colors/description/?utm_source=chatgpt.com

public class leet_75 {

    static void main(String[] args) {

        int[] nums = new int[]{2, 0, 2, 1, 1, 0};

    }


    public void sortColors(int[] nums) {

        int low=0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high){

            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if (nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else {
                mid++;
            }
        }
    }
    static void swap(int[] arr , int low , int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high ] = temp;
    }

}
