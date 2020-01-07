package src.multiDimensionalArrays;

public class MultiDimensionalArrays {
    public void multiDimensionalArrays(){

        int [][] grid = {
                {3,5,677},
                {234,45,6,6},
                {2,23,34,45,5}
        };

        System.out.println(grid[1][0]);
        System.out.println(grid[2][4]);
        System.out.println(grid[1][2]);

        String [][] texts = new String [2][3];

        texts[0][1]="jdksbk jkdsb";

        System.out.println(texts[0][1]);

        for (int row=0;row<grid.length; row++){
            for(int col=0;col < grid[row].length;col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
}}
