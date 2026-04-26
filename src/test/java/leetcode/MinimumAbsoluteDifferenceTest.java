package leetcode;

import org.junit.jupiter.api.Test;

class MinimumAbsoluteDifferenceTest {

    @Test
    void test() {
        MinimumAbsoluteDifference test = new MinimumAbsoluteDifference();
        int[] arr = {4,2,1,3};
        var result = test.minimumAbsDifference(arr);
        System.out.println(result);
    }
}