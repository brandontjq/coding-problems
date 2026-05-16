package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void test() {
        ThreeSum test = new ThreeSum();
        //int[] nums = {-1,0,1,2,-1,-4};
        int[] nums = {-1,0,1,2,-1,-4,-1,2};
        var result = test.threeSum(nums);
        System.out.println(result);
    }
}