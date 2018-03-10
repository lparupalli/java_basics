package com.lalitha;

public class AddTwoDimensionalMatrix {

    private final int[][] firstMatrix;
    private final int[][] secondMatrix;
    private final int[][] finalMatrix;
    private final int rows;
    private final int columns;


    public AddTwoDimensionalMatrix(int rows,
                                int columns){
        this.firstMatrix = new int[rows][columns];
        this.secondMatrix = new int[rows][columns];
        this.finalMatrix = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    public void populateArrayOne(int startNumber){
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++){
                this.firstMatrix[i][j] = startNumber;
                startNumber++;
            }
        }

    }

    public void populateArrayTwo(int startNumber){
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.secondMatrix[i][j] = startNumber;
                startNumber++;
            }
        }
    }

    public void printFirstArray() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.firstMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void printSecondArray() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.secondMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void addArray() {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.finalMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                    System.out.print(finalMatrix[i][j]+ " ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args){
        AddTwoDimensionalMatrix  obj = new AddTwoDimensionalMatrix(2,2);
        obj.populateArrayOne(1);
        obj.populateArrayTwo(2);
        obj.printFirstArray();
        obj.printSecondArray();
        obj.addArray();
    }
}

