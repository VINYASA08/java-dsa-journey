//https://leetcode.com/problems/sqrtx/

public class Leet_69 {
    static void main(String[] args) {

        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) return x;

        int mid = 0 ;
        int low = 0;
        int high = x;

        while (low <= high){

            mid = low + (high - low) /2;
            if (mid == 0) {
                low = mid + 1;
                continue;
            }

            if (mid>x /mid){
                high = mid-1;
            } else if (mid < x /mid) {
                low = mid+1;
            }else {
                return mid;
            }
        }

        return high;
    }
}
