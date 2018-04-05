package com.lalitha.dataStructures;

public class TestStack {
    public static void main(String[] args){
        Stack s = new Stack(1);
        int datavalue = 0;
        for (int i=0;i<3;i++){
            s.push(datavalue++);
            s.push(datavalue++);
            s.push(datavalue++);
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println("End of Iteration");
        }
        //s.push(4);

//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        //System.out.println(s.pop());
//        s.push(1);
//        System.out.println(s.pop());
//        //System.out.println(s.pop());
    }
}
