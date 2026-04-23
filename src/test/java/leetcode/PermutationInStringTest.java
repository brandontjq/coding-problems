package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void test() {
        PermutationInString test = new PermutationInString();
        String s1 = "ab";
        String s2 = "eidboaoo";
        var result = test.checkInclusion(s1, s2);
        System.out.println(result);
    }
}