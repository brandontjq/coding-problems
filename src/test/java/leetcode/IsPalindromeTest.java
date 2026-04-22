package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        IsPalindrome isPalindrome = new IsPalindrome();
        boolean result = isPalindrome.isPalindrome(s);
        System.out.println(result);
    }
}