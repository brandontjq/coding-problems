package ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void isUniqueTest() {
        Question1 q1 = new Question1();
        String s = "abc";
        assertTrue(q1.isUniqueChars(s));
        String s1 = "abcc";
        assertFalse(q1.isUniqueChars(s1));
    }

}