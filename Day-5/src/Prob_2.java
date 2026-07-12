import java.util.Scanner;

/*Problem Description
Given a 2D integer array matrix representing a ragged grid (where rows can have different
 lengths), calculate the sum of elements for each column.
Return an array ans where ans[j] is the sum of all elements in the $j$-th column
 of the matrix. If a row does not contain a $j$-th column, treat its value as 0 for
 that column's sum. The length of the returned array should match the maximum
 column length present in the matrix. */
import java.util.Scanner;

/*Problem Description
Given a 2D integer array matrix representing a ragged grid (where rows can have different
 lengths), calculate the sum of elements for each column.
Return an array ans where ans[j] is the sum of all elements in the $j$-th column
 of the matrix. If a row does not contain a $j$-th column, treat its value as 0 for
 that column's sum. The length of the returned array should match the maximum
 column length present in the matrix. */
public class Prob_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array row: ");
        int x = input.nextInt();
        System.out.print("Enter array column: ");
        int y = input.nextInt();

        int[][] arr = new int[x][y];
        for (int rows = 0; rows < arr.length; rows++)
            for (int col = 0; col < arr[rows].length; col++)
                arr[rows][col] = input.nextInt();


        int[][] ans =new int[x][y];
        for (int col = 0; col < y; col++){
            for (int row = 0; row < x; row++){
                ans[row][col]+=arr[row][col];
            }
        }

        for (int row = 0; row < x; row++){
            for (int col = 0; col < y; col++){
                System.out.print(ans[row][col]+" ");
            }
        }
    }
}
