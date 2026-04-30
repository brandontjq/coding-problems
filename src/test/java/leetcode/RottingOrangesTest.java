package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    @Test
    void test() {
        RottingOranges test = new RottingOranges();
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1},
        };
//        int[][] grid = {
//                {2,1,1},
//                {0,1,1},
//                {1,0,1},
//        };

        var result = test.orangesRotting(grid);
        System.out.println(result);
    }
}