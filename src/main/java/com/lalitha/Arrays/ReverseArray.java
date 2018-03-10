package com.lalitha.Arrays;

public class ReverseArray {

    public int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public ReverseArray() {
        System.out.println("Array before reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void reverseMethod() {
        System.out.println("array after reverse");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

