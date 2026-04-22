package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatCharacters {

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char character = s.charAt(right);

            // If duplicate found, move left pointer
            if (map.containsKey(character)) {
                left = Math.max(left, map.get(character) + 1);
            }

            map.put(character, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstringBruteForce(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int currentTotal = 0;
            if (set.add(s.charAt(i))) {
                currentTotal++;
                for (int j = i + 1; j < s.length(); j++) {
                    if (set.add(s.charAt(j))) {
                        currentTotal++;

                    } else {
                        set.clear();
                        break;
                    }
                }
                max = Math.max(max, currentTotal);
            }
        }

        return max;
    }
}
