package leetcode;

import java.util.*;

public class CheckSubArraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // remainder 0 seen at index -1
        // this helps when a valid subarray starts from index 0
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remainder = prefixSum % k;

            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);

                // subarray length must be at least 2
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                // only store the first occurrence
                map.put(remainder, i);
            }
        }

        return false;
    }
}
