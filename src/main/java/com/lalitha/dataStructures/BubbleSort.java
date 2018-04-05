package com.lalitha.dataStructures;

public class BubbleSort {
    private int[] arr;
    private int i ,j,temp;
    public BubbleSort(int n){
        this.arr =new int[n];
    }
    public void method(int[] arr){
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    arr[j]=temp;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
