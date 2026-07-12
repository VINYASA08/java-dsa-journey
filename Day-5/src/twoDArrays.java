import java.util.Arrays;
import java.util.Scanner;

public class twoDArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int x = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int y = sc.nextInt();
        int[][] arr2D =new int[x][y];

        for(int row = 0; row <arr2D.length; row++){
            for(int col = 0; col <arr2D[row].length; col++){
                arr2D[row][col]=sc.nextInt();
            }
        }
//
//        for(int row = 0; row <arr2D.length; row++){
//            for(int col = 0; col <arr2D[row].length; col++){
//                System.out.print(arr2D[row][col]+" ");
//            }
//            System.out.println();
//        }

        for(int row = 0; row <arr2D.length; row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }
    }

}
