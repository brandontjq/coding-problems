package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @Test
    void test() {
        InsertInterval insertInterval = new InsertInterval();
//        int[][] intervals = {{1,3}, {6,9}};
//        int[] newInterval = {2,5};
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {0,4};
        int[][] result = insertInterval.insert(intervals, newInterval);
        System.out.println(result);
    }

}