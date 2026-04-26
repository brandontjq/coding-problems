package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void test() {
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        //int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {1,1,2};
        var result = test.removeDuplicates(arr);
        System.out.println(result);
    }
}