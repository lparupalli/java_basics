package com.lalitha.Arrays;

public class SumOfArray {
    private static int arr[] = {1,2,3,4,5};
    private int sum = 0;

    public SumOfArray(){
        this.sum = sum;
   }
    public int sum(){
        for(int i= 0; i<arr.length;i++){
            this.sum = this.sum + arr[i];

        }
        return this.sum;
    }
}
