package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPointsYouCanObtainFromCardsTest {

    @Test
    void test() {
        MaximumPointsYouCanObtainFromCards test = new MaximumPointsYouCanObtainFromCards();
        //int[] cardPoints = {1,2,3,4,5,6,1};
        //int[] cardPoints = {2,2,2};
       //int[] cardPoints = {9,7,7,9,7,7,9};
        int[] cardPoints = {100,1,1,1,1,50,50};
        int k = 3;

        var result = test.maxScore(cardPoints, k);
        System.out.println(result);
    }
}