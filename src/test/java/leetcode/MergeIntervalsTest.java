package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    @Test
    void test() {
        MergeIntervals test = new MergeIntervals();
        int[][] intervals = {
                {1,2},
                {2,6},
                {8,10},
                {15,18},
        };
        var result = test.merge(intervals);
        System.out.println(result);
    }
}