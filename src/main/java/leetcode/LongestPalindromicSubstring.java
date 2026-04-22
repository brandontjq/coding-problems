package leetcode;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);       // odd length
            int len2 = expandFromCenter(s, i, i + 1);   // even length
            int len = Math.max(len1, len2);
//
//            if (len > end - start + 1) {
//                start = i - (len - 1) / 2;
//                end = i + len / 2;
//            }
            if (len > maxLength) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
                maxLength = len;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int res = right - left - 1;
        return res;
    }

    public String longestPalindrome2(String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String expandOdd = expand(s, i, i);
            if (expandOdd.length() > result.length()) {
                result = expandOdd;
            }
            String expandEven = expand(s, i, i+ 1);
            if (expandEven.length() > result.length()) {
                result = expandEven;
            }
        }

        return result;

    }

    private String expand (String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);

    }
}
