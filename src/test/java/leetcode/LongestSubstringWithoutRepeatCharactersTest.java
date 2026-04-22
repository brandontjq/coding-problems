package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatCharactersTest {


    @Test
    void longestSubstring() {
        String s = "abbac";
        LongestSubstringWithoutRepeatCharacters l = new LongestSubstringWithoutRepeatCharacters();
        int res = l.lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    @Test
    void longestSubstringBruteForce() {
        LongestSubstringWithoutRepeatCharacters test = new LongestSubstringWithoutRepeatCharacters();
        String s = " ";
        var res = test.lengthOfLongestSubstringBruteForce(s);
        System.out.println(res);
    }
}