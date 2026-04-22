package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedSortedArrayTest {

    @Test
    void test() {
        SearchRotatedSortedArray test = new SearchRotatedSortedArray();
        int[] arr = {4,5,6,7,0,1,2};
        var result = test.search(arr, 6);
        System.out.println(result);
    }
}