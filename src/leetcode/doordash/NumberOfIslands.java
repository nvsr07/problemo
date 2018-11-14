package leetcode.doordash;

public class NumberOfIslands {
    /**
     * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
     *
     * Example 1:
     *
     * Input:
     * 11110
     * 11010
     * 11000
     * 00000
     *
     * Output: 1
     * Example 2:
     *
     * Input:
     * 11000
     * 11000
     * 00100
     * 00011
     *
     * Output: 3
     * */
    public int numIslands(char[][] grid) {
        int counter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++ ){
                if(grid[i][j] == '1'){
                    counter++;
                    conquer(i, j, grid);
                }
            }
        }
        return counter;
    }

    void conquer(int i, int j, char [][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        conquer(i+1, j, grid);
        conquer(i-1, j, grid);
        conquer(i, j+1, grid);
        conquer(i, j-1, grid);

    }
}
