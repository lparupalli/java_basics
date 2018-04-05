package com.lalitha.dataStructures;

public class TestQueue {
    public static void main(String[] arg) {
        Queue q = new Queue(3);
        q.enQueue(2);
        q.enQueue(3);
        //q.enQueue(4);
        //q.enQueue(5);
        //q.enQueue(5);

        //q.enQueue(5);
        //q.enQueue(5);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(5);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());


        //System.out.println(q.deQueue());

        //q.enQueue(5);
        //System.out.println(q.deQueue());
        //q.enQueue(6);
       // System.out.println(q.deQueue());
       // System.out.println(q.deQueue());


    }
}
