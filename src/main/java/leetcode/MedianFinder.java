package leetcode;

import java.util.*;

public class MedianFinder {
    private PriorityQueue<Integer> pq;

    public MedianFinder() {
        pq = new PriorityQueue<>();
    }

    public void addNum(int num) {
        pq.add(num);
    }

    public double findMedian() {
        int size = pq.size();
        int mid = size / 2;
        int count = mid;
        Integer[] arr = pq.toArray(new Integer[size]);
        int current = pq.peek();
        if(size == 2) {
            current = pq.poll();
        } else {
            int countBound = size % 2 != 0 ? 0 : 1;
            while(count >= countBound) {
                current = pq.poll();
                count--;
            }
        }


        if(size % 2 != 0) {
            pq.clear();
            for(int num : arr) {
                pq.add(num);
            }
            return current * 1.0;
           //return arr[mid] * 1.0;
        } else {

            double result = (current + pq.poll()) * 1.0 / 2;
            pq.clear();
            for(int num : arr) {
                pq.add(num);
            }
            return result;
        }
    }
}
