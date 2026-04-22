package ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question5Test {
    @Test
    void testOneEditAway() {
        String s1 = "pale";
        String s2 = "bale";
        String s3 = "ale";
        Question5 q5 = new Question5();
        assertTrue(q5.oneEditAway(s1,s2));
        assertTrue(q5.oneEditAway(s1,s3));
    }
}