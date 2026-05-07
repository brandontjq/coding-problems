package leetcode;

import java.util.*;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    bfsVisit(grid, row, col);
                    count++;
                }
            }
        }
        return count;

    }

    private void bfsVisit (char[][] grid, int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = {
                {-1 ,0},
                {0, -1,}, {0, 1},
                {1, 0},
        };
        queue.offer(new int[] {row, col});
        grid[row][col] = '*';

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int currentRow = current[0];
                int currentCol = current[1];

                for (int[] dir : dirs) {
                    int newRow = currentRow + dir[0];
                    int newCol = currentCol + dir[1];

                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == '1') {
                        queue.offer(new int[]{newRow, newCol});
                        grid[newRow][newCol] = '*';
                    }
                }
            }
        }
    }
}
