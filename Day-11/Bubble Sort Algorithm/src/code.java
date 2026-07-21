import java.util.Arrays;

public class code {
    static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 5, 6, 7, 8, 9, 21, 23};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            if(!swapped==true){
                break;
            }
        }
    }
 }
