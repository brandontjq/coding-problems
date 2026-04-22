package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqCharTest {
    @Test
    void test() {
        FirstUniqChar test = new FirstUniqChar();
        var s = "leetcode";
        var result = test.firstUniqChar(s);
        System.out.println(result);
    }
}