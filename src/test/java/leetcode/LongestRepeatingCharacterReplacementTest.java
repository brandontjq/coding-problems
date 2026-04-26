package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void test() {
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        String s = "AAAAABCDE";
        int k = 1;
        var result = test.characterReplacement(s, k);
        System.out.println(result);

    }
}