package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void test() {
        ReverseWords test = new ReverseWords();
        //String s = "the sky is blue";
        String s = "a good   example";
        var result = test.reverseWords(s);
        System.out.println(result);
    }
}