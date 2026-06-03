package leetcode;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int count = 0;
        for (int num : nums) {
            minHeap.offer(num);
            count++;
            if (count > k) {
                minHeap.poll();
            }

        }
        return minHeap.peek();
    }
}
