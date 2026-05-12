package leetcode;

public class MaximumPointsYouCanObtainFromCards {

    public int maxScore(int[] cardPoints, int k) {
        int maxScore = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        maxScore = Math.max(maxScore, sum);

        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - i - 1];
            sum += cardPoints[cardPoints.length - 1 - i];
            maxScore = Math.max(maxScore, sum);
        }


        return maxScore;
    }
}
