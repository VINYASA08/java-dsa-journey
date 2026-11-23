package Arrays;

public class FrequencyCounting {

    static void main(String[] args) {

        int[] arr = {4, -3,2, 5, 3, 2, 4, 1};
        int[] arr1 = {-10, -5, 0, 5, 10};
        countFrequencyNegative(arr1);

    }

    static int getMaxIndex(int[] arr){

        if(arr == null || arr.length ==0){
            return -1;
        }

        int maxIndex = 0;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static int getMinIndex(int[] arr){

        if(arr == null || arr.length ==0){
            return -1;
        }

        int minIndex = 0;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }

        return minIndex;
    }

    static void countFrequency(int[] arr){

        if(arr == null || arr.length ==0){
            return;
        }


        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        int[] freq = new int[max + 1];

        for(int  i =0 ; i<arr.length; i++){
            freq[arr[i]]++;
        }

        for(int  i =0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                System.out.println(i + " occurs " + freq[i] + " times.");
            }
        }
    }

    static  void countFrequencyNegative(int[] arr){

        if(arr == null || arr.length ==0){
            return;
        }

        int minValue = arr[getMinIndex(arr)];
        int maxValue = arr[getMaxIndex(arr)];
        int lenght = maxValue - minValue + 1;


        int[] freq = new int[lenght+1];

        for(int  i =0 ; i<arr.length; i++){
            freq[arr[i] - minValue]++;
        }

        for(int  i =0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                System.out.println((i + minValue) + " occurs " + freq[i] + " times.");
            }
        }

    }

}
