package ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    @Test
    void permutationTest() {
        String s1 = "abc";
        String s2 = "cba";
        Question2 q2 = new Question2();
        assertTrue(q2.permutation(s1,s2));
        String s3 = "dfd";
        assertFalse(q2.permutation(s1,s3));
    }

    @Test
    void testPermutationEfficient () {
        String s1 = "abc";
        String s2 = "cba";
        Question2 q2 = new Question2();
        assertTrue(q2.permutationEfficient(s1,s2));
        String s3 = "dfd";
        assertFalse(q2.permutationEfficient(s1,s3));
    }
}