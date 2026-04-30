package leetcode;

import java.util.*;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while (i >=0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                nums1[i] = nums2[j];
                i--;
                j--;
            }
            k--;
        }

        System.out.println(nums1);
    }
}
