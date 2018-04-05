package com.lalitha.dataStructures;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;

    public CircularQueue(int capacity){
        this.arr = new int[capacity];
    }

    public void enQueue(int item){
        if(rear == arr.length && front == 0){
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        }else if (rear == arr.length){
            rear = 0;
        }
        arr[rear]=item;
        rear++;
    }
    public int deQueue(){
        if(front==rear-1){
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }else if(front == arr.length && rear > 0){
            front = 0;
        }
        int dequeuedValue = arr[front];
        front++;
        return dequeuedValue;
    }

    public void show(){
        System.out.println("elements are");
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
