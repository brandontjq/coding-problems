package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void test() {
        RemoveElement test = new RemoveElement();
        //int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {3,2,2,3};
        var result = test.removeElement(nums, 3);
        System.out.println(result);
    }
}