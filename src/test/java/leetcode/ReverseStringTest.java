package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void name() {
        ReverseString test = new ReverseString();
        char[] chars = new char[] {'h', 'e', 'l','l', 'o'};
        var result = test.reverse(chars);
        System.out.println(result);
    }
}