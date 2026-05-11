package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumOfDistinctSubarraysWithLengthKTest {

    @Test
    void test() {
        MaximumSumOfDistinctSubarraysWithLengthK test = new MaximumSumOfDistinctSubarraysWithLengthK();
        int[] nums = {1,5,4,2,9,9,9,9};
        var result = test.maximumSubarraySum(nums, 3);
        System.out.println(result);
    }
}