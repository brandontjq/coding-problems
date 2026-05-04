package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    void test() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        SpiralMatrix test = new SpiralMatrix();
        var result = test.spiralOrder(matrix);
        System.out.println(result);
    }
}