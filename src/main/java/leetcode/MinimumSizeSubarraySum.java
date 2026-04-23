package leetcode;

public class MinimumSizeSubarraySum {

    public int minSubArrayLenSlow(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];

            if (sum >= target) {
                min = 1;
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                }
                if (sum > target) {
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public int minSubArrayLenFast(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;

                while (left <= right) {
                    if (sum >= target) {
                        min = Math.min(min, right - left + 1);
                        sum -= nums[left];
                        left++;
                    } else {
                        break;
                    }
                }
            }
        }

        return min;
    }
}
