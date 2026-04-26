package leetcode;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num : nums) {

            if(set.add(num)) {
                nums[count] = num;
                count++;
            }

        }
        return count;
    }
}
