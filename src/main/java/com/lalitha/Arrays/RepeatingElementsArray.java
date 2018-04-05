package com.lalitha.Arrays;

public class RepeatingElementsArray {

    public int[] arr = new int[3];

    void printArray(int[] arr, int size){
        System.out.println("Repeated elements are");
        int i, j;
        for(i=0; i< size;i++ ){
          for(j=i+1;j<size;j++){
              if(arr[i]==arr[j]){
                  System.out.println(arr[i]+"");
              }

              }
          }
        }
}
