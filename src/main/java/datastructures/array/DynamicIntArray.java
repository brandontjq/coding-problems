package datastructures.array;

public class DynamicIntArray {

    //our int array
    private int[] arr;
    //size of array
    private int capacity;
    //current number of elements in the array
    private int numberOfElements;

    public DynamicIntArray() {
        this.arr = new int[1];
        this.capacity = 1;
        this.numberOfElements = 0;
    }

    public void add(int data) {

        //If current number of elements is same as capacity of array, double the size of array
        if (numberOfElements == capacity) {
            int[] temp = new int[2 * capacity];

            //Copy elements from old array into new array, and then double the capacity
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            capacity *= 2;
            arr = temp;
        }

        //Simply adding the data to the end of array and increasing the number of elements.
        arr[numberOfElements] = data;
        numberOfElements++;

    }

    public void add(int index, int data) {

        if (index >= numberOfElements || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index Given!");
        }
        //If current number of elements is same as capacity of array, double the size of array
        if (numberOfElements == capacity) {
            int[] temp = new int[2 * capacity];

            //Copy elements from old array into new array, and then double the capacity
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            capacity *= 2;
            arr = temp;
        }

        for (int i = numberOfElements; i >= index; i--) {
            //shifting all the elements to the left from the specified index
            //arr[i + 1] = arr[i];
            arr[i] = arr[i-1];
        }

        arr[index] = data;
        numberOfElements++;
    }

    public void remove(int index) {
        if (index >= numberOfElements || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index Given!");
        }


        //[1,2,3,4,5]
        //[1,3,4,5]
        for (int i = index; i < numberOfElements - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[numberOfElements - 1] = 0;
        numberOfElements--;


    }

    //returns size of array
    public int size() {
        return this.numberOfElements;
    }


    //get element based on index
    public int get(int index) {
        if (index < numberOfElements && index > 0) {
            return arr[index];
        }

        throw new IndexOutOfBoundsException("Invalid Index Given!");
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void print() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
