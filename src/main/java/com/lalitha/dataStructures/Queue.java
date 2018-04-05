package com.lalitha.dataStructures;

import com.intellij.ide.actions.AboutPopup;

import java.util.NoSuchElementException;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int capacity) {
        //this.size = size;
        this.arr = new int[capacity];
    }

    public void enQueue(int i) {
        if (rear == arr.length ) {
            throw new ArrayIndexOutOfBoundsException("queue is full");

        }else{
                arr[rear] = i;
                rear = rear + 1;
            }

    }

    public int deQueue() {
        if (front == rear) {
            throw new NoSuchElementException("Queue is empty");
        }else{
            int i = arr[front];
            front = front + 1;
            return i;
        }
    }
}


