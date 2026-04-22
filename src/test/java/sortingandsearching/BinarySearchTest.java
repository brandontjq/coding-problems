package sortingandsearching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {3,7,9,12,5,77,8,60};
        int result = binarySearch.search(arr, 12, 0, arr.length-1);
        int anotherResult = binarySearch.search(arr, 123, 0, arr.length-1);
        assertEquals(12, result);
        assertEquals(-1, anotherResult);
    }

}