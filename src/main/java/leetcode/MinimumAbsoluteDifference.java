package leetcode;

import java.util.*;

public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDistance = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < minDistance) {
                    minDistance = Math.abs(arr[i] - arr[j]);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int num : arr) {
            if (map.containsKey(num - minDistance)) {
                List<Integer> list = new ArrayList<>();
                int first = map.get(num - minDistance);
                list.add(arr[first]);
                list.add(num);
                result.add(list);
            }
        }
        return result;
    }
}
