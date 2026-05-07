package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {
    @Test
    void test() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '0'},
        };
        NumberOfIslands test = new NumberOfIslands();
        var result = test.numIslands(grid);
        System.out.println(result);
    }
}