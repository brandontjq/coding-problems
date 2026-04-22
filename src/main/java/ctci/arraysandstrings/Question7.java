package ctci.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class Question7 {

    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        if(n == 0 || n != matrix[0].length) throw new RuntimeException("error");

        for(int a = 0; a < n/2; a++) {
            for(int b = a; b < n-a-1; b++) {
                // Store current cell in
                // temp variable
                int temp = matrix[a][b];
                //Store Left to Top
                matrix[a][b] = matrix[n - 1 - b][a];

                //Store Bottom To Left
                matrix[n - 1 - b][a] = matrix[n - 1 - a][n - 1 - b];

                //Store Right to Bottom
                matrix[n - 1 - a][n - 1 - b] = matrix[b][n - 1 - a];

                // Assign temp to right
                matrix[b][n - 1 - a] = temp;

            }


        }
        return matrix;
    }

    public int[] faster(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int x = target-nums[i];
            if(map.containsKey(target- nums[i]) && target- nums[i] != nums[i]) {
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
        }
        return result;
    }
}
