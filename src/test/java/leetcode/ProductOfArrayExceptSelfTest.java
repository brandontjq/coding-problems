package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void test() {
        ProductOfArrayExceptSelf test = new ProductOfArrayExceptSelf();
        int[] nums = {1,2,3,4};
        var result = test.productExceptSelf(nums);
        System.out.println(result);
    }
}