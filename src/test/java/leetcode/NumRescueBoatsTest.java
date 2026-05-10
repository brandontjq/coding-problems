package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumRescueBoatsTest {

    @Test
    void test() {
        NumRescueBoats test = new NumRescueBoats();
        int[] people = {3,8,7,1,4};
        var result = test.numRescueBoats(people, 9);
        System.out.println(result);
    }
}