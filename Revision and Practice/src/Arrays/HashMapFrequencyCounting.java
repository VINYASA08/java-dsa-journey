package Arrays;

import java.util.HashMap;
import java.util.Map;
public class HashMapFrequencyCounting {

    static void main(String[] args) {

        int[] arr = {-1000000, 5, 1000000000, 5, -1000000};
        int[] arr1 = {4, 2, 4, 3, 2, 4, 2, 2};
        //countFrequencyUsingMap(arr);
        System.out.println(findMostFrequent(arr1));
    }

    static void countFrequencyUsingMap(int[] arr){

        if(arr == null || arr.length ==0){
            return;
        }

        HashMap<Integer , Integer> freq = new HashMap<>(arr.length);

        for(int i = 0 ; i < arr.length ; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) +1 );
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int number = entry.getKey();

            int count = entry.getValue();

            System.out.println(number + " occurs " + count + " times.");
        }
    }


    static int findMostFrequent(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int maxFrequency = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int number = entry.getKey();
            int count = entry.getValue();

            if (count > maxFrequency) {
                maxFrequency = count;
                result = number;
            }
            else if (count == maxFrequency && number < result) {
                result = number;
            }
        }

        return result;
    }
}
