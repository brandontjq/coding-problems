package leetcode;

import java.util.*;

public class FirstUniqChar {

    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return 1;
            }
        }
        return -1;
    }
}
