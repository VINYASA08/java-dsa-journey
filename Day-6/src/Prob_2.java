//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class Prob_2 {
    static void main(String[] args) {
        int[][] grid = {{3,2},{1,0}};
        System.out.print(countNegatives(grid));
    }

    static public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;

    }
}
