package ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    @Test
    void URLifyTest() {
        Question3 q3 = new Question3();
        String s = "Mr John Smith     ";
        q3.replaceSpaces(s.toCharArray(), 13);
    }

}