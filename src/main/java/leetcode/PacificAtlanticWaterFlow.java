package leetcode;

import java.util.*;

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        for(int r = 0; r < heights.length; r++) {
            for(int c = 0; c < heights[r].length; c++) {
                int currentCell = heights[r][c];
                boolean[] reached = new boolean[2];
                if(dfs(heights, r, c, reached, currentCell)) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(r);
                    cell.add(c);
                    result.add(cell);
                }
            }

        }
        return result;
    }

    private boolean dfs(int[][] heights, int r, int c, boolean[] reached, int previousHeight) {
        if(r >= heights.length || r < 0) {
            return false;
        }

        if(c >= heights[r].length || c < 0) {
            return false;
        }

        //cell has already been visited
        if(heights[r][c] == -1 || heights[r][c] > previousHeight) {
            return false;
        }

        if(r == 0 || c == 0) {
            reached[0] = true;
        }


        if(r == heights.length-1 || c == heights[r].length-1 ) {
            reached[1] = true;
        }

        if(reached[0] && reached[1]) {
            return true;
        }

        //mark visited
        int tmp = heights[r][c];
        heights[r][c] = -1;

        if(dfs(heights, r-1, c, reached, tmp) ||
                dfs(heights, r+1, c, reached, tmp) ||
                dfs(heights, r, c-1, reached, tmp) ||
                dfs(heights, r, c+1, reached, tmp)) {
            heights[r][c] = tmp;
            return true;
        }

        //unmark
        heights[r][c] = tmp;
        return false;
    }
}
