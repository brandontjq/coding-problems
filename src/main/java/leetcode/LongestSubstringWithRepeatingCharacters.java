package leetcode;

public class LongestSubstringWithRepeatingCharacters {

    public int solve (String s) {
        int result = 1;
        int maxLength = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                maxLength++;
            } else {
                maxLength = 1;
            }
            result = Math.max(result, maxLength);
        }
        return result;
    }
}
