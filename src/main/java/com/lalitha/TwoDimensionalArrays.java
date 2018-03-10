package com.lalitha;

public class TwoDimensionalArrays {

    private int startNumber;
    private final int[][] arr;
    private final int rows;
    private final int columns;


    public TwoDimensionalArrays(int rows,
                                int columns, int startNumber){
        this.arr = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
        this.startNumber = startNumber;
    }

    public void populateArray(){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++){
                this.arr[i][j] = this.startNumber;
                this.startNumber++;
            }
        }

    }
    public void printArray() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
            TwoDimensionalArrays  obj = new TwoDimensionalArrays(
                    2,2,3);
            obj.populateArray();
            obj.printArray();
    }
}

