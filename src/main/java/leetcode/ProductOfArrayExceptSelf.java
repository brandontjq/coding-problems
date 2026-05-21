package leetcode;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int leftProduct = 1;
        int[] leftArr = new int[nums.length];
        leftArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct *= nums[i-1];
            leftArr[i] = leftProduct;
        }

        int rightProduct = 1;
        int[] rightArr = new int[nums.length];
        rightArr[nums.length - 1] = 1;
        for (int j = nums.length - 2; j >=0; j--) {
            rightProduct *= nums[j + 1];
            rightArr[j] = rightProduct;
        }
        int[] res = new int[nums.length];
        for (int k = 0; k < leftArr.length; k++) {
            res[k] = leftArr[k] * rightArr[k];
        }
        return res;
    }
}
