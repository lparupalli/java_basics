package com.lalitha.Arrays;

public class TestArrayRotation {
    public static void main(String[] args){
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = {1,2,3,4,5,6,7};
        rotate.leftRotate(arr , 2, 7);
        rotate.printArray(arr, 7);
    }

}
