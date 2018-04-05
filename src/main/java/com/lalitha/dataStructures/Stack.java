package com.lalitha.dataStructures;

public class Stack {

    private int[] arr;
    private int head = 0;

    public Stack(int stackSize){
        this.arr = new int[stackSize];
    }

    void push(int i){
        if(head < arr.length) {
            arr[head] = i;
            head++;
        }else{
            throw new StackOverFlowException("Stack size is exceded");
        }
    }

    int pop(){
        if(head > 0) {
            head--;
            return arr[head];
        }else{
            throw new EmptyStackException("Stack is empty");
        }
    }
}
