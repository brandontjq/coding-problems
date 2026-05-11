package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyLettersTest {

    @Test
    void test() {
        ReverseOnlyLetters test = new ReverseOnlyLetters();
        //String s = "ab-cd";
        String s = "Test1ng-Leet=code-Q!";
        var result = test.reverseOnlyLetters(s);
        System.out.println(result);
    }
}