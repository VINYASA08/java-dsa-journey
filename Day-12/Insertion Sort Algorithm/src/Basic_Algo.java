import java.util.Arrays;

public class Basic_Algo {
    public static void main(String[] args) {
        int [] arr={5,4,5,8,6,2,4,-8,5,50,2,-10,80,85,};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swape(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swape(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
