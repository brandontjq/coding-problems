package ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {
    @Test
    void isPermutationOfPalindromeTest() {
        String s = "Tact Coa";
        Question4 q4 = new Question4();
        assertTrue(q4.isPermutationOfPalindrome(s));
    }
}