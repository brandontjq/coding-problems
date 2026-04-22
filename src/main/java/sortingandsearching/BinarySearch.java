package sortingandsearching;

public class BinarySearch {

    public int search(int[] array, int val, int low, int high) {
        while(low <= high) {
            int mid = (low+high) /2;
            if(val < array[mid]) {
                high = mid -1;
            } else if(val == array[mid]) {
                return array[mid];
            } else if( val > array[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
