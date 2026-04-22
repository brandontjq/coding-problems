package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInArrayTest {

    @Test
    void test() {
        KthLargestElementInArray test = new KthLargestElementInArray();
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        int result = test.findKthLargest(arr, k);
        System.out.println(result);
    }
}