package sortingandsearching;

public class MergeSort {

    public void sort(int[] arr) {
        //Base case where array is of size 1
        if(arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;

        //Creating temporary arrays
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        //Copying values into temp arrays
        for(int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for(int i = mid; i < arr.length; i++) {
            rightArr[i-mid] = arr[i];
        }

        sort(leftArr);
        sort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    private void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;

        while(i < leftArr.length && j < rightArr.length) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        //Copying remaining values to arr
        while(i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while(j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }

    public void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
