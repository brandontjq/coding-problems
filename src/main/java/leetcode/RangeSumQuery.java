package leetcode;

public class RangeSumQuery {

    //prefix technique
    private int[] prefixArr;

    public RangeSumQuery(int[] nums) {
        prefixArr = new int[nums.length];
        int prefixSum = nums[0];
        prefixArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum += nums[i];
            prefixArr[i] = prefixSum;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixArr[right];
        }
        return prefixArr[right] - prefixArr[left - 1];
    }
}
