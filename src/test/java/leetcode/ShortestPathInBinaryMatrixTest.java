package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathInBinaryMatrixTest {

    @Test
    void test() {
        ShortestPathInBinaryMatrix test = new ShortestPathInBinaryMatrix();
        int[][] matrix = {
            {0,0,0},
            {1,1,0},
            {1,1,0}
        };
//        int[][] matrix = {
//            {0,1},
//            {1,0}
//        };
//        int[][] matrix = {
//            {0,0},
//            {0,0}
//        };
//        int[][] matrix = {
//                {0, 0, 0},
//                {1, 1, 0},
//                {1, 1, 1}
//        };
        var result = test.shortestPathBinaryMatrix(matrix);
        System.out.println(result);
    }
}