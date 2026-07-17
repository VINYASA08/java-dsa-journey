public class binarySearching {
  public   static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,13,15,18,25};
        System.out.print("index is  "+binary(arr,12));

    }

    public static int binary(int[] arr , int target) {
    int start=0;
    int end =arr.length-1;

    while (start<=end){
        int mid = start + ( end - start ) / 2;

        if(target<arr[mid]){
            end=mid-1;
        } else if (target>arr[mid]) {
            start=mid+1;
        }else {
            return mid;
        }
    }
    return -1;
  }

}
