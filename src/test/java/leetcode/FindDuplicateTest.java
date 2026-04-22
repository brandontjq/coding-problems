package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateTest {
    @Test
    void test() {
        FindDuplicate test = new FindDuplicate();
        int[] arr = {1,3,4,2,2};
        var result = test.findDuplicate(arr);
        System.out.println(result);
    }
}