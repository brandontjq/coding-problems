package leetcode;

import datastructures.linkedlist.Link;

import java.util.*;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {

        int minutes = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {
                {-1,0}, //up
                {1,0}, //down
                {0 ,-1}, //left
                {0, 1} //right
        };

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 2) {
                    queue.offer(new int[] {row, col});
                    grid[row][col] = 3;
                }
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();;
            for (int i = 0; i < size; i++) {
                int[] currentCell = queue.poll();
                int currentRow = currentCell[0];
                int currentCol = currentCell[1];

                for (int j = 0; j < directions.length; j++) {
                    int newRow = currentRow + directions[j][0];
                    int newCol = currentCol + directions[j][1];

                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[newRow].length
                            && grid[newRow][newCol] == 1) {
                        queue.offer(new int[] {newRow, newCol});
                        grid[newRow][newCol] = 3; //mark as visited
                    }
                }
            }
            if (!queue.isEmpty()) {
                minutes++;
            }
        }

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    return -1;
                }
            }
        }


        return minutes;
    }

    private int infect(int[][] grid, int row, int col) {
        int minutes = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {
                {-1,0}, //up
                {1,0}, //down
                {0 ,-1}, //left
                {0, 1} //right
        };
        queue.offer(new int[]{row, col});
        grid[row][col] = 3; //3 is to mark as visited

        while (!queue.isEmpty()) {
            int size = queue.size();;
            for (int i = 0; i < size; i++) {
                int[] currentCell = queue.poll();
                int currentRow = currentCell[0];
                int currentCol = currentCell[1];

                for (int j = 0; j < directions.length; j++) {
                    int newRow = currentRow + directions[j][0];
                    int newCol = currentCol + directions[j][1];

                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[newRow].length
                            && grid[newRow][newCol] == 1) {
                        queue.offer(new int[] {newRow, newCol});
                        grid[newRow][newCol] = 3; //mark as visited
                    }
                }
            }
            if (!queue.isEmpty()) {
                minutes++;
            }
        }

        return minutes;
    }
}
