package sortingandsearching;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void test() {
        MergeSort mergeSort = new MergeSort();
        int[] testarr = { 12, 11, 13, 5, 6, 7 };
        mergeSort.sort(testarr);
        mergeSort.printArray(testarr);
    }

}