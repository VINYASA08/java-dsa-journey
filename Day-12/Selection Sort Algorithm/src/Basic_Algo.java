import java.lang.reflect.Array;
import java.util.Arrays;

public class Basic_Algo {
    public static void main(String[] args) {
        int[] arr={-5,4,0,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        for(int i =0 ; i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex=getMax(arr,0,last);
            swape(arr,maxIndex,last);
        }
    }

    static int getMax(int[] arr , int start,int end){
        int max=start;

        for(int i = start ; i<=end; i++){
            if (arr[max] < arr[i]) {
                max=i;
            }
        }
        return max;
    }

    static void swape(int[] arr, int first , int last ){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
