package datastructures.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    void test() {
        var result = LongestPalindromicSubstring.longestPalindromicSubstring("abaxyzzyxf");
        System.out.println(result);
    }

    @Test
    void anotherTest() {
        String s = "abc";
        System.out.println(s.substring(0,3));
    }
}