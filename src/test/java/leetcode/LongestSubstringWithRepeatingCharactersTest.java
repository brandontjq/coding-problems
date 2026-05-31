package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithRepeatingCharactersTest {

    @Test
    void test() {
        String s = "aaabbbaaa";
        LongestSubstringWithRepeatingCharacters test = new LongestSubstringWithRepeatingCharacters();
        var result = test.solve(s);
        System.out.println(result);
    }
}