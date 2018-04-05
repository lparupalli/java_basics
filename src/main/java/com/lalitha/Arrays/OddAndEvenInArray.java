package com.lalitha.Arrays;

public class OddAndEvenInArray {
    private int[] arr;
    private int i;
    public OddAndEvenInArray(int n){
        this.arr = new int[n];
    }
    public void odd(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println("odd numbers are:"+arr[i]);
            }
        }
    }

}
