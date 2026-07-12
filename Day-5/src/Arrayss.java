import java.util.Scanner;
import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        printArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void printArray(int[] arr) {
        arr[0] = 99;
        return ;
    }
}
