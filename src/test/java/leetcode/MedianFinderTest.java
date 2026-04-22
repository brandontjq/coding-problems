package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {
    @Test
    void test() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(-1);
        double result1 = mf.findMedian();
        System.out.println(result1);
        mf.addNum(-2);
        double result2 = mf.findMedian();
        System.out.println(result2);
        mf.addNum(-3);
        double result3 = mf.findMedian();
        System.out.println(result3);
        mf.addNum(-4);
        double result4 = mf.findMedian();
        System.out.println(result4);
        mf.addNum(-5);
        double result5 = mf.findMedian();
        System.out.println(result5);
    }
}