package leetcode;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] array = new ArrayList[nums.length + 1]; //to deal with edge case if nums is single element e.g. [1]

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (array[entry.getValue()] == null) {
                array[entry.getValue()] = new ArrayList<>();
            }
            array[entry.getValue()].add(entry.getKey());

        }
        int[] result = new int[k];
        int count = 0;
        for (int i = array.length - 1; i >=0; i--) {
            if (array[i] != null) {
                List<Integer> list = array[i];
                for (int j = 0; j < list.size(); j++) {
                    result[count] = list.get(j);
                    count++;
                    if (count == k) {
                        return result;
                    }
                }

            }
        }
        return result;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a,b) -> Integer.compare(a.getValue(), b.getValue()) //Entry with smallest value at the top of the PQ
        );

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;

    }
}
