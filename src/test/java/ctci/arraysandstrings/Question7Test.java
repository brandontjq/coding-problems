package ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Question7Test {
    @Test
    void testRotateRight90Degrees() {
        Question7 q7 = new Question7();

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.deepToString(q7.rotate(matrix)));
    }

    @Test
    void test() {
        Question7 q7 = new Question7();
        int[] test = {3,2,4};
        q7.faster(test, 6);
    }
}
