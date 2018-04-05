package com.lalitha.dataStructures;

public class TestCircularQueue {
    public static void main(String[] args){
        CircularQueue c = new CircularQueue(3);
        c.enQueue(2);
        c.enQueue(3);
        System.out.println(c.deQueue());
        c.enQueue(4);
        c.enQueue(5);
        System.out.println(c.deQueue());
        System.out.println(c.deQueue());
        System.out.println(c.deQueue());
//        c.enQueue(5);
//        c.enQueue(6);
//        System.out.println(c.deQueue());
//        System.out.println(c.deQueue());
//        c.enQueue(7);
//        System.out.println(c.deQueue());
//        System.out.println(c.deQueue());
        //System.out.println(c.deQueue());
        //System.out.println(c.deQueue());
        //c.show();


    }
}
