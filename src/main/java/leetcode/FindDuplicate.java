package leetcode;

public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: find intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

//        while (slow != fast) {
//            slow = nums[slow];
//            fast = nums[nums[fast]];
//        }
        System.out.println(slow);
        System.out.println(fast);
        // Step 2: find entrance to cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
