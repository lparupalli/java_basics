package com.lalitha.dataStructures;

public class TestBubbleSort {
    public static void main(String[] args){
        BubbleSort b = new BubbleSort(5);
        int[] arr= {20,14,6,32,58};
        b.method(arr);
        System.out.println("sorted arr is :");
    }
}
