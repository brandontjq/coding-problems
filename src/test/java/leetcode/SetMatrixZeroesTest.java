package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {

    @Test
    void test() {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,0,5}
        };

        SetMatrixZeroes test = new SetMatrixZeroes();
        test.setZeroes(matrix);
        System.out.println("done");
    }
}