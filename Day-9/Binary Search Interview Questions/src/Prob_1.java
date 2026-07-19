public class Prob_1 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,13,15,16,18};
        int target=14;
        System.out.print(ceiling(arr,target));
    }

    static int ceiling(int[] arr , int target){
        int close=0;
        int low=0;
        int high=arr.length-1;

        while (low<=high){

            int mid=low+(high-low)/2;

            if(target<arr[mid]){
                high=mid-1;
            }else if (target>arr[mid]){
                low=mid+1;
            }else {
                return arr[mid];
            }
        }
        return arr[low];
    }
}
