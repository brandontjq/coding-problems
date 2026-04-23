package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubArraySumTest {

    @Test
    void test() {
        CheckSubArraySum test = new CheckSubArraySum();
        int[] arr = {23,2,4,6,7};
        int k = 6;
        var result = test.checkSubarraySum(arr, 6);

        System.out.println(result);
    }
}