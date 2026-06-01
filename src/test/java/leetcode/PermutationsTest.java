package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void test() {
        Permutations test = new Permutations();
        int[] nums = {1,2,3};
        var result = test.permute(nums);
        System.out.println(result);
    }
}