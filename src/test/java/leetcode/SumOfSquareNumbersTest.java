package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquareNumbersTest {

    @Test
    void test() {
        SumOfSquareNumbers test = new SumOfSquareNumbers();
        var result = test.judgeSquareSum(10);
        System.out.println(result);
    }
}