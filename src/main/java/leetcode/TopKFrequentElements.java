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
}
