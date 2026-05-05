package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void test() {
        int[] arr = {1,1,1,2,2,3,};
        int[] arr2 = {1};
        TopKFrequentElements test = new TopKFrequentElements();
        var result = test.topKFrequent(arr2, 2);
        System.out.println(Arrays.toString(result));
    }
    @Test
    void test2() {
        int[] arr = {1,1,1,2,2,3};

        TopKFrequentElements test = new TopKFrequentElements();
        var result = test.topKFrequent2(arr, 2);
        System.out.println(Arrays.toString(result));
    }
}