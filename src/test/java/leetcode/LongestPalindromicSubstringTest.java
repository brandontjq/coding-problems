package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    void test() {
        var s = "baddad";
        var s2 = "ba";
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();
        var result = test.longestPalindrome2(s2);
        System.out.println(result);
    }
}