package com.lalitha.dataStructures;

public class StackUsingLinkedList {
    public static void main(String[] args){
        Stack1 s = new Stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.pop();
        s.displayStack();
    }
}
