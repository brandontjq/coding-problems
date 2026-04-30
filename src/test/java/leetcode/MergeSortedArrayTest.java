package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void test() {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;

        MergeSortedArray test = new MergeSortedArray();
        test.merge(nums1, m, nums2, n);
    }
}