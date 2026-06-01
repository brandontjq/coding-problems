package leetcode;

import java.util.*;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, result, new LinkedHashSet<>());
        return result;
    }

    private void solve(int[] nums, List<List<Integer>> result, Set<Integer> tempList) {
        if(tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if (!tempList.contains(nums[i])) {
                tempList.add(nums[i]);
                solve(nums, result, tempList);
                tempList.remove(nums[i]);
            }
        }

    }
}
