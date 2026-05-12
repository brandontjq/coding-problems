package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingSubarrayBeautyTest {

    @Test
    void test() {
        SlidingSubarrayBeauty test = new SlidingSubarrayBeauty();
        int[] nums = {1,-1,-3,-2,3};
        var result = test.getSubarrayBeauty(nums, 3, 2);
        System.out.println(result);
    }
}