//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class Prob_1 {
    public static void main(String[] args) {

        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.print(singleNonDuplicate(nums));
    }

    public  static int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }else{
                high=mid;
            }
        }

        return nums[low];
    }
}

