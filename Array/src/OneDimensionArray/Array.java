package OneDimensionArray;

import IArray.IArray;

public class Array implements IArray {
    int arr[];
    int length = 0;

    public Array() {
        this(5);
    }

    public Array(int size) {
        arr = new int[size];
    }

    public void traversal() {
        System.out.println("Display array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("index: %d | %d\n", i, arr[i]);
        }
    }

    // add to first of array
    public void insertAtStart(int data) {
        if (length == arr.length) {
            System.out.println("Array is overflow");
            return;
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = data;
        length++;
    }

    public void insertAtPosition(int data, int position) {
        if (position > arr.length - 1) {
            System.out.println("Out of array index");
            return;
        }
        for (int i = arr.length - 2; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = data;
    }

    public int findElement(int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return arr[i];
        }
        return -1;
    }

    public void insertAtEnd(int data) {
        arr[length] = data;
        length++;
    }

    public void deleteAtStart() {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        length--;
    }

    public void deleteAtEnd() {
        arr[length] = 0;
        length--;
    }

    public void deleteAtPosition(int position) {
        if (position > arr.length - 1) {
            System.out.println("Out of array index");
            return;
        }
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;    
    }

}
