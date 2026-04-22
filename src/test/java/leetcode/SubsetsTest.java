package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @Test
    void test() {
        Subsets subsets = new Subsets();
        int[] nums = {1,2, 3};
        List<List<Integer>> result = subsets.subsets(nums);
        System.out.println(result);
    }

}