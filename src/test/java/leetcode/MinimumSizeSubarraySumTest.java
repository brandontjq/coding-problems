package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    @Test
    void test() {
        MinimumSizeSubarraySum test = new MinimumSizeSubarraySum();
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {2,3,1,2,4,3};
        int[] arr = {1,5,5,8};
        int k = 4;
        var result = test.minSubArrayLenFast(k, arr);
        System.out.println(result);
    }
}