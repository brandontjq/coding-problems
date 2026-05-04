package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix01Test {

    @Test
    void test() {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        Matrix01 test = new Matrix01();
        var result = test.updateMatrix(mat);
        System.out.println(result);
    }
}