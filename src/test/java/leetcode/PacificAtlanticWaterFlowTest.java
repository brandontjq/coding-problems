package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PacificAtlanticWaterFlowTest {

    @Test
    void test() {
        PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();
        int[][] input = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4},
        };

        List<List<Integer>> result = pacificAtlanticWaterFlow.pacificAtlantic(input);
        System.out.println(result);
    }

}