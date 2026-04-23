package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    @Test
    void test() {
        SubarraySumEqualsK test = new SubarraySumEqualsK();
        int[] arr = {1,-1,1,1,1,-2};
        //int[] arr = {1,-1,1};
        int k = 1;

        var result = test.subarraySum(arr, k);
        System.out.println(result);
    }
    @Test
    void test2() {
        SubarraySumEqualsK test = new SubarraySumEqualsK();
        int[] arr = {1,0,1,0,1};
        int k = 2;

        var result = test.subarraySum2(arr, k);
        System.out.println(result);
    }
}