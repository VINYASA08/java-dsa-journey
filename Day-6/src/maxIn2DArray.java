import java.util.Arrays;

public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,12},
                {3,4,13},
                {5,6,4}
        };
        System.out.println(findMax(arr));

    }

    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

