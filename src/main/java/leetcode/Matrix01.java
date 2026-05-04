package leetcode;

import java.util.*;

public class Matrix01 {

    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] result = new int[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        for (int row = 0; row < rows; row++) {
            Arrays.fill(result[row], -1);
        }

        // Add all 0s as starting points
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (mat[row][col] == 0) {
                    result[row][col] = 0;
                    queue.offer(new int[]{row, col});
                }
            }
        }

        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows &&
                        newCol >= 0 && newCol < cols &&
                        result[newRow][newCol] == -1) {

                    result[newRow][newCol] = result[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return result;
    }
}
