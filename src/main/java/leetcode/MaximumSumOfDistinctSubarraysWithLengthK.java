package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSumOfDistinctSubarraysWithLengthK {
    //nums = [1,5,4,2,9,9,9]
    public long maximumSubarraySum(int[] nums, int k) {
        long result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int sum = 0;


        for (int right = 0; right < nums.length; right++ ) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            if (right - left == k - 1) {
                if (map.size() == k) {
                    result = Math.max(result, sum);
                }

                //handle left pointer, reduce frequency by 1 and remove from map if it reaches 0
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                sum -= nums[left];
                left++;
            }
        }
        return result;
    }
}
