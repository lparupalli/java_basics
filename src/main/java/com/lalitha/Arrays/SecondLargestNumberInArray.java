package com.lalitha.Arrays;

public class SecondLargestNumberInArray {

    public int arr[] = {20,31,45,47,85,79};
    private int max = arr[0];
    private int secondMax = arr[0];

    void secondLargest() {
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] > max) {
                   secondMax = max;
                   max = arr[i];
               } else if (arr[i] > secondMax) {
                   secondMax = arr[i];
                   System.out.println("the first largest is :" + max);
                   System.out.println("the second largest is :" + secondMax);
               }
           }

         //void  printArray(int[] arr, int size) {
             int i;
            for ( i = 0; i < arr.length ; i++)
                System.out.print(arr[i] + "\t");
        }
    }

